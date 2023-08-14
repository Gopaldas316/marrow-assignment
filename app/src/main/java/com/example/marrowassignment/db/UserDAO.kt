package com.example.marrowassignment.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.marrowassignment.models.UserEntity

@Dao
interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user : UserEntity)

    @Query("select exists (select * from user where name = :userName and password = :userPassword)")
    fun isAnExistingUser(userName: String, userPassword : String) : LiveData<Boolean>
}