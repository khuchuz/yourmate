package org.capstone.yourmate.domain.repository

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.User

interface IAuthRepository {
    fun signIn(email: String, password: String): Flow<Resource<User>>

    fun signUp(email: String, password: String, name: String): Flow<Resource<User>>

    fun signOut(): Flow<Resource<Boolean>>

    fun getCurrentUser(): Flow<Resource<User>>

    fun sendResetPassword(email: String): Flow<Resource<Boolean>>

    fun updateMessagingToken(token: String): Flow<Resource<Boolean>>

    fun getCurrentMessagingToken(): Flow<Resource<String>>
}