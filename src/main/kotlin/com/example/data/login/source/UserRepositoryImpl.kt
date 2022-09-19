package com.example.data.login.source

import com.example.data.login.model.UserDataModel
import com.example.data.login.tables.UsersTable
import com.example.domain.login.source.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

class UserRepositoryImpl() : UserRepository {
    override suspend fun insert(user: UserDataModel): Unit = withContext(Dispatchers.IO) {
        transaction {
            UsersTable.insert {
                it[login] = user.login
                it[password] = user.password
                it[name] = user.name ?: ""
            }
        }
    }

    override suspend fun update(user: UserDataModel) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(user: UserDataModel) {
        TODO("Not yet implemented")
    }

    override suspend fun selectUserByLogin(login: String): UserDataModel {
        TODO("Not yet implemented")
    }

}