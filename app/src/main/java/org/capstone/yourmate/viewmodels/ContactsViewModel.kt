package org.capstone.yourmate.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import org.capstone.yourmate.domain.usecase.ContactUseCase
import javax.inject.Inject

@HiltViewModel
class ContactsViewModel @Inject constructor(private val contactUseCase: ContactUseCase) :
    ViewModel() {
    fun getAllContacts() = contactUseCase.getContacts().asLiveData()
}