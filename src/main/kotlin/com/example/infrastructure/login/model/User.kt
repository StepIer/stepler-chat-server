package com.example.infrastructure.login.model

import com.example.domain.login.model.UserDomainModel

data class User(
    val id: Int? = null,
    val login: String,
    val password: String,
    val token: String? = null,
    val name: String?,
)

fun User.toDomain(): UserDomainModel {
    return UserDomainModel(
        id = this.id,
        login = this.login,
        password = this.password,
        token = this.token ?: "",
        name = this.name,
    )
}

fun UserDomainModel.toInfrastructure(): User {
    return User(
        id = this.id ?: 0,
        login = this.login,
        password = this.password,
        token = this.token ?: "",
        name = this.name,
    )
}
