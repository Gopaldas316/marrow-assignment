package com.example.marrowassignment.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.marrowassignment.db.UserDatabase
import com.example.marrowassignment.models.UserEntity

class RepositoryImpl(private val database : UserDatabase) : Repository {
    override suspend fun insertUser(user: UserEntity) {
        database.userDao().insertUser(user)
    }

    override suspend fun isAnExistingUser(user: UserEntity) : LiveData<Boolean> {
        return database.userDao().isAnExistingUser(userName = user.name, userPassword = user.password)
    }
}