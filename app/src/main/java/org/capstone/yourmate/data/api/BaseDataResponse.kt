package org.capstone.yourmate.data.api

data class BaseDataResponse<T>(
    val id: String,
    val attributes: T
)
