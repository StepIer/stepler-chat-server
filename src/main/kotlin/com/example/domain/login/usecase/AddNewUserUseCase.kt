package com.example.domain.login.usecase

import com.example.domain.login.adapter.UserRepository
import com.example.domain.login.model.UserDomainModel
import com.example.domain.login.model.toData

class AddNewUserUseCase(
    private val userRepository: UserRepository
) {

    suspend fun invoke(user: UserDomainModel) {
        userRepository.insert(user.toData())
    }
}