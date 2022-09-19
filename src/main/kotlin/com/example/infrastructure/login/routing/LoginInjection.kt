package com.example.infrastructure.login.routing

import com.example.infrastructure.config.appComponent
import javax.inject.Inject

class LoginInjection {

    init {
        appComponent.inject(this)
    }

    @Inject
    lateinit var loginController: LoginController
}