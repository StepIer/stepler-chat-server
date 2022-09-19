package com.example.di.login

import com.example.data.login.adapter.UserRepositoryImpl
import com.example.domain.login.adapter.UserRepository
import com.example.domain.login.usecase.AddNewUserUseCase
import com.example.infrastructure.login.routing.LoginController
import dagger.Module
import dagger.Provides

@Module
object LoginModule {

    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepositoryImpl()
    }

    @Provides
    fun provideAddNewUserUseCase(
        userRepository: UserRepository
    ): AddNewUserUseCase {
        return AddNewUserUseCase(userRepository)
    }

    @Provides
    fun provideLoginController(
        addNewUserUseCase: AddNewUserUseCase
    ): LoginController {
        return LoginController(addNewUserUseCase)
    }
}
