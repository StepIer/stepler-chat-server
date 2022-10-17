package com.example.infrastructure.config

import com.example.di.AppComponent
import com.example.di.DaggerAppComponent
import com.example.infrastructure.config.plugins.configureRouting
import io.ktor.http.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

val appComponent: AppComponent = DaggerAppComponent.create()

fun main() {
    try {
        ServerConfig.defaultConfig()
        embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: DEFAULT_PORT) {
//        configureSockets()
            configureRouting()
        }.start(wait = true)
    } catch (e: Exception) {
        LoggerServer.logger.info("Exception: $e")
    }

}

