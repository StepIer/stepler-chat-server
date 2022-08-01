package com.example

import io.ktor.server.engine.*
import com.example.plugins.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        configureSockets()
        configureRouting()
    }.start(wait = true)
}
