package com.denis.appForRentaTeam.ui.userListFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.denis.appForRentaTeam.di.App
import com.denis.appForRentaTeam.presentation.viewModels.UsersViewModel
import com.example.inventory.R
import com.example.inventory.databinding.UserListFragmentBinding
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject
import kotlinx.coroutines.flow.collect

class UserListFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<UsersViewModel> { viewModelFactory }

    private var _binding: UserListFragmentBinding? = null
    private val binding get() = _binding!!

    private var userListAdapter: UserListAdapter? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as App).appComponent.injectUsersListFragment(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = UserListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        initObservers()
        initClickListener()
    }

    private fun initViews() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerView.run {
            userListAdapter = UserListAdapter()
            adapter = userListAdapter
        }
    }

    private fun initObservers() {
        with(viewModel) {
            with(binding) {
                lifecycleScope.launchWhenStarted {
                    getListOfUsers().collect { useList ->
                        userListAdapter?.submitList(useList)
                        progressBar.visibility = View.GONE
                        swiperefresh.isRefreshing = false
                    }
                }
                showError().observe(viewLifecycleOwner) { error ->
                    showToast(error)
                    progressBar.visibility = View.GONE
                    swiperefresh.isRefreshing = false
                }
            }
        }
    }

    private fun initClickListener() {
        with(binding) {
            swiperefresh.setOnRefreshListener {
                viewModel.lodUsers()
                if (recyclerView.adapter?.itemCount != 0) {
                    swiperefresh.isRefreshing = false
                }
            }
        }
    }

    private fun showToast(message: String) {
        Snackbar.make(binding.root, R.string.network_error, Snackbar.LENGTH_LONG).show()
        Log.d("LOAD_ERROR", message)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
