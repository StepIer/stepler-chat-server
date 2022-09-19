package com.example.data.login.tables

import org.jetbrains.exposed.sql.Table

object UsersTable : Table("user") {
    val id = integer("id").autoIncrement()
    val login = varchar("login", 50)
    val password = varchar("password", 50)
    val token = varchar("token", 255).nullable()
    val name = varchar("name", 100).nullable()
}