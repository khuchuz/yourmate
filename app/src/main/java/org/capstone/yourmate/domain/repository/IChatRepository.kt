package org.capstone.yourmate.domain.repository

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.Message
import org.capstone.yourmate.domain.model.User

interface IChatRepository {
    fun getMessagesWith(userId: String): Flow<Resource<List<Message>>>
    fun sendMessageTo(
        userId: String,
        message: String,
        messagingToken: String
    ): Flow<Resource<Message>>

    fun getLastChats(): Flow<Resource<List<Message>>>
    fun getAllChats(): Flow<Resource<List<User>>>
}