package com.example.infrastructure.config

import com.example.di.AppComponent
import com.example.di.DaggerAppComponent
import com.example.infrastructure.config.plugins.configureRouting
import com.example.infrastructure.config.plugins.configureSockets
import io.ktor.http.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*


val appComponent: AppComponent = DaggerAppComponent.create()

fun main() {

    ServerConfig.defaultConfig()
    embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: DEFAULT_PORT) {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSockets()
        configureRouting()
    }.start(wait = true)
}


