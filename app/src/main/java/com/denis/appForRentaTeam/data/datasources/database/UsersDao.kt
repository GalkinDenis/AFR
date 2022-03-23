package com.denis.appForRentaTeam.data.datasources.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: UsersEntity)

    @Query("SELECT * from Users")
    fun getListOfUsers(): Flow<List<UsersEntity>>

}
