package com.example.infrastructure.login.routing

import com.example.domain.login.usecase.AddNewUserUseCase
import com.example.infrastructure.login.model.User
import com.example.infrastructure.login.model.toDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class LoginController(
    private val addNewUserUseCase: AddNewUserUseCase
) {

    fun registrationUser(user: User) {
        runBlocking {
            withContext(Dispatchers.IO) {
                addNewUserUseCase.invoke(user.toDomain())
            }
        }
    }
}