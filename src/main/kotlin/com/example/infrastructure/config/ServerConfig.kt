package com.example.infrastructure.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database

object ServerConfig {

    fun defaultConfig() {
        val config = HikariConfig()
        config.driverClassName = "org.postgresql.Driver"
        config.jdbcUrl =
            "jdbc:postgresql://ec2-44-205-64-253.compute-1.amazonaws.com:5432/dpn11rv49v563?sslmode=require"
        config.username = "oxpgatwhhhslni"
        config.password = "ffb16ba4f8ebb6ac294b0d32959ed3d5ef8f59213d2131a5ce3710634d59942d"
        config.maximumPoolSize = 3
        config.isAutoCommit = false
        config.transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        config.validate()
        val dataSource = HikariDataSource(config)
        Database.connect(dataSource)
    }
}


