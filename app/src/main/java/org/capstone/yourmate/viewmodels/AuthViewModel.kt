package org.capstone.yourmate.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import org.capstone.yourmate.domain.usecase.AuthUseCase
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val authUseCase: AuthUseCase) : ViewModel() {
    val currentUser = authUseCase.getCurrentUser().asLiveData()

    val currentMessagingToken = authUseCase.getCurrentMessagingToken().asLiveData()

    fun login(email: String, password: String) =
        authUseCase.signIn(email, password).asLiveData()

    fun register(email: String, password: String, name: String) =
        authUseCase.signUp(email, password, name).asLiveData()

    fun updateMessagingToken(token: String) = authUseCase.updateMessagingToken(token).asLiveData()

    fun logout() = authUseCase.signOut().asLiveData()
}