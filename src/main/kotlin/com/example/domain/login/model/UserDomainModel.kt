package com.example.domain.login.model

import com.example.data.login.model.UserDataModel

data class UserDomainModel(
    val id: Int?,
    val login: String,
    val password: String,
    val token: String,
    val name: String?,
)

fun UserDataModel.toDomain(): UserDomainModel {
    return UserDomainModel(
        id = this.id,
        login = this.login,
        password = this.password,
        token = this.token ?: "",
        name = this.name,
    )
}

fun UserDomainModel.toData(): UserDataModel {
    return UserDataModel(
        id = this.id ?: 0,
        login = this.login,
        password = this.password,
        token = this.token ?: "",
        name = this.name,
    )
}
