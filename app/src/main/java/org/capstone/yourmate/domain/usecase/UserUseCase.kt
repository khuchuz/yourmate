package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.User

interface UserUseCase {
    fun getUserById(id: Int): Flow<Resource<User>>
}