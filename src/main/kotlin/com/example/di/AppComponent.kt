package com.example.di

import com.example.di.login.LoginModule
import com.example.infrastructure.login.routing.LoginInjection
import dagger.Component
import dagger.Module

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(injection: LoginInjection)
}

@Module(includes = [LoginModule::class])
object AppModule {
}
