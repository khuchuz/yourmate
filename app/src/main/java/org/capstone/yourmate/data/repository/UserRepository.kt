package org.capstone.yourmate.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.data.api.YourmateApi
import org.capstone.yourmate.domain.model.User
import org.capstone.yourmate.domain.repository.IUserRepository
import javax.inject.Inject

private const val TAG = "ArticleRepository"

class UserRepository @Inject constructor(
    private val yourmateApi: YourmateApi
) : IUserRepository {
    override fun getUserById(id: Int): Flow<Resource<User>>  = flow {
        emit(Resource.Loading())
        val response = yourmateApi.getUserById(id)
        if (response.isSuccessful) {
            emit(Resource.Success(response.body()!!))
        } else {
            emit(Resource.Error(response.message()))
        }
    }
}
