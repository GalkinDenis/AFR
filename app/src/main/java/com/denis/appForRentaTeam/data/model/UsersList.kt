package com.denis.appForRentaTeam.data.model

data class UsersList (
    val page: Long,
    val per_page: Long,
    val total: Long,
    val total_pages: Long,
    val data: List<User>,
    val support: Support
)

data class User (
    val id: Long,
    val email: String,
    val first_name: String,
    val last_name: String,
    val avatar: String
)

data class Support (
    val url: String,
    val text: String
)
