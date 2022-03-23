package com.denis.appForRentaTeam.presentation.viewModels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class UserCardViewModel @Inject constructor() : ViewModel() {

    private var _userAvatar: String? = null
    val userAvatar get() = _userAvatar

    private var _userFirstName: String? = null
    val userFirstName get() = _userFirstName

    private var _userLastName: String? = null
    val userLastName get() = _userLastName

    private var _userEmail: String? = null
    val userEmail get() = _userEmail

    fun attachUser(avatar: String, firstName: String, lastName: String, email: String) {
        _userAvatar = avatar
        _userFirstName = firstName
        _userLastName = lastName
        _userEmail = email
    }

}