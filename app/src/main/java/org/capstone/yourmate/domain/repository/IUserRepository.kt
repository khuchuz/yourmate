package org.capstone.yourmate.domain.repository

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.User

interface IUserRepository {
    fun getUserById(id: Int): Flow<Resource<User>>
}