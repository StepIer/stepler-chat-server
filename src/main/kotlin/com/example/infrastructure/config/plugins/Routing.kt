package com.example.infrastructure.config.plugins

import com.example.infrastructure.login.routing.loginRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        loginRouting()
    }
}
