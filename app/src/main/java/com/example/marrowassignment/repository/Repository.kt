package com.example.marrowassignment.repository

import androidx.lifecycle.LiveData
import com.example.marrowassignment.models.UserEntity

interface Repository {
    suspend fun insertUser(user : UserEntity)

    suspend fun isAnExistingUser(user : UserEntity) : LiveData<Boolean>
}