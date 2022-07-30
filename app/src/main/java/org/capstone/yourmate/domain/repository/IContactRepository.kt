package org.capstone.yourmate.domain.repository

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.User

interface IContactRepository {
    fun getContacts(): Flow<Resource<List<User>>>
    fun getContact(id: String): Flow<Resource<User>>
}