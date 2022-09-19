package com.example.domain.login.adapter

import com.example.data.login.model.UserDataModel

interface UserRepository {

    suspend fun insert(user: UserDataModel)
    suspend fun update(user: UserDataModel)
    suspend fun delete(user: UserDataModel)
    suspend fun selectUserByLogin(login: String): UserDataModel
}