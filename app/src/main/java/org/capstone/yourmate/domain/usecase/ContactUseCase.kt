package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.User

interface ContactUseCase {
    fun getContact(id: String): Flow<Resource<User>>
    fun getContacts(): Flow<Resource<List<User>>>
}