package com.example.domain.login.usecase

import com.example.domain.login.model.UserDomainModel
import com.example.domain.login.model.toData
import com.example.domain.login.source.UserRepository

class AddNewUserUseCase(
    private val userRepository: UserRepository
) {

    suspend fun invoke(user: UserDomainModel) {
        userRepository.insert(user.toData())
    }
}