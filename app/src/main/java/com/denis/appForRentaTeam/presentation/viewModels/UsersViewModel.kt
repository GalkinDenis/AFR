package com.denis.appForRentaTeam.presentation.viewModels

import androidx.lifecycle.*
import com.denis.appForRentaTeam.domain.usecases.GetUsersUseCase
import com.denis.appForRentaTeam.domain.usecases.LoadUsersUseCase
import com.denis.appForRentaTeam.domain.entities.Users
import com.denis.appForRentaTeam.presentation.SingleLiveEvent
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class UsersViewModel @Inject constructor(
    private val getUsersUseCase: GetUsersUseCase,
    private val loadUsersUseCase: LoadUsersUseCase,
) : ViewModel() {

    private val _errorHandler = SingleLiveEvent<String>()
    fun showError(): SingleLiveEvent<String> = _errorHandler

    private val getListOfUsersExceptionHandler = CoroutineExceptionHandler { _, error ->
        _errorHandler.value = error.toString()
    }

    private val _getListOfUsers: MutableStateFlow<List<Users>?> = MutableStateFlow(null)
    fun getListOfUsers(): StateFlow<List<Users>?> = _getListOfUsers

    init {
        viewModelScope.launch {
            getUsersUseCase()
                .onEach { listUsers ->
                    if (listUsers.isEmpty()) lodUsers()
                }
                .flowOn(Dispatchers.IO)
                .collect { listOfUsers ->
                    _getListOfUsers.value = listOfUsers
                }
        }
    }

    fun lodUsers() {
        viewModelScope.launch(getListOfUsersExceptionHandler) {
            loadUsersUseCase()
        }
    }

}



