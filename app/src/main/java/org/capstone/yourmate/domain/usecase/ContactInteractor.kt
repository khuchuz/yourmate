package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.User
import org.capstone.yourmate.domain.repository.IContactRepository
import javax.inject.Inject

class ContactInteractor @Inject constructor(private val contactRepository: IContactRepository) : ContactUseCase {
    override fun getContact(id: String): Flow<Resource<User>> = contactRepository.getContact(id)

    override fun getContacts(): Flow<Resource<List<User>>> = contactRepository.getContacts()
}