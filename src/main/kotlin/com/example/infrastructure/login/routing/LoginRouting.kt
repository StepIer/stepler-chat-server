package com.example.infrastructure.login.routing

import com.example.infrastructure.login.model.User
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Routing.loginRouting() {

    val loginController = LoginInjection().loginController

    get("/add-User") {
        val login = call.parameters["login"] ?: ""
        val password = call.parameters["password"] ?: ""
        val name = call.parameters["name"] ?: ""

        loginController.registrationUser(User(login = login, password = password, name = name))
    }

}