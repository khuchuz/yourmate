package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.data.repository.UserRepository
import org.capstone.yourmate.domain.model.User
import javax.inject.Inject

class UserInteractor @Inject constructor(private val userRepository: UserRepository) :
    UserUseCase {
    override fun getUserById(id: Int): Flow<Resource<User>> = userRepository.getUserById(id)
}
