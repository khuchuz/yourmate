package org.capstone.yourmate.splash_screen

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import org.capstone.yourmate.auth.login.LoginActivity
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.databinding.ActivitySplashScreenBinding
import org.capstone.yourmate.domain.model.User
import org.capstone.yourmate.home.HomeActivity
import org.capstone.yourmate.utils.extensions.showToast
import org.capstone.yourmate.viewmodels.AuthViewModel

@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {

    private val authViewModel: AuthViewModel by viewModels()
    private lateinit var binding: ActivitySplashScreenBinding

    private var currentUser: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        authViewModel.currentUser.observe(this) {
            when (it) {
                is Resource.Loading -> Unit
                is Resource.Success -> {
                    currentUser = it.data
                    checkToken()
                }
                is Resource.Error -> {
                    navigateToLogin()
                }
            }
        }
    }

    private fun checkToken() {
        authViewModel.currentMessagingToken.observe(this) {
            when (it) {
                is Resource.Error -> {
                    showToast("Gagal mendapatkan token")
                    navigateToHome()
                }
                is Resource.Loading -> Unit
                is Resource.Success -> {
                    if (currentUser?.messagingToken != it.data && it.data != null) {
                        updateMessagingToken(it.data)
                    } else {
                        navigateToHome()
                    }
                }
            }
        }
    }

    private fun updateMessagingToken(token: String) {
        authViewModel.updateMessagingToken(token).observe(this) {
            when (it) {
                is Resource.Error -> {
                    updateMessagingToken(token)
                }
                is Resource.Loading -> Unit
                is Resource.Success -> {
                    navigateToHome()
                }
            }
        }
    }

    private fun navigateToLogin() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    private fun navigateToHome() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}