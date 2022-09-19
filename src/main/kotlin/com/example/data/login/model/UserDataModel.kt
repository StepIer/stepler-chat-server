package com.example.data.login.model

data class UserDataModel(
    val id: Int = 0,
    val login: String = "",
    val password: String = "",
    val token: String? = null,
    val name: String? = null,
)
