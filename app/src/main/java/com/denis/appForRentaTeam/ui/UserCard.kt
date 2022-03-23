package com.denis.appForRentaTeam.ui

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.denis.appForRentaTeam.di.App
import com.denis.appForRentaTeam.presentation.viewModels.UserCardViewModel
import com.example.inventory.R
import com.example.inventory.databinding.UserCardLayoutBinding
import com.squareup.picasso.Picasso
import javax.inject.Inject

class UserCard : Fragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<UserCardViewModel> { viewModelFactory }

    private var _binding: UserCardLayoutBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as App).appComponent.injectUserCardFragment(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = UserCardLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            with(it) {
                if(!isEmpty) {
                    viewModel.attachUser(
                        getString("avatar").toString(),
                        getString("first").toString(),
                        getString("last").toString(),
                        getString("email").toString()
                    )
                }

                if(!viewModel.userAvatar.isNullOrEmpty()) {
                    bindAvatar()

                    bindTextViews()
                }else{
                    binding.ifEmptyText.visibility = View.VISIBLE
                }
            }
        }
    }

    private fun bindAvatar() {
        Picasso.get()
            .load(viewModel.userAvatar)
            .error(R.drawable.ic_baseline_cloud_off_24)
            .placeholder(R.drawable.progress_animation)
            .centerCrop()
            .fit()
            .noFade()
            .into(binding.avatarHead)
    }

    private fun bindTextViews() {
        with(binding) {
            firstNameHead.text = getString(R.string.first_name)
            firstName.text = viewModel.userFirstName
            lastNameHead.text = getString(R.string.last_name)
            lastName.text = viewModel.userLastName
            emailHead.text = getString(R.string.email_name)
            email.text = viewModel.userEmail
        }
    }

    override fun onDestroy() {
        super.onDestroy()
             _binding = null
    }
}