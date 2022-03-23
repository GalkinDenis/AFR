package com.denis.appForRentaTeam.data.datasources.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.denis.appForRentaTeam.domain.entities.Users

@Entity(tableName = "users")
data class UsersEntity(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long = 0,

    @ColumnInfo(name = "email")
    val email: String,

    @ColumnInfo(name = "first_name")
    val first_name: String,

    @ColumnInfo(name = "last_name")
    val last_name: String,

    @ColumnInfo(name = "avatar")
    val avatar: String

)

fun UsersEntity.toUsers(): Users {
    return Users(
        id = this.id,
        email = this.email,
        first_name = this.first_name,
        last_name = this.last_name,
        avatar = this.avatar
    )
}
