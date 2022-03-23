package com.denis.appForRentaTeam.data.datasources.network

import com.denis.appForRentaTeam.data.model.UsersList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UsersApi {
    @GET("{path}")
    suspend fun loadUsers(@Path("path") path: String): Response<UsersList>
}