package com.denis.appForRentaTeam.domain.entities

data class Users(
    val id: Long,
    val email: String,
    val first_name: String,
    val last_name: String,
    val avatar: String
)
