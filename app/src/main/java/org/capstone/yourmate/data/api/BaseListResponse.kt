package org.capstone.yourmate.data.api

data class BaseListResponse<T>(
    val data: List<BaseDataResponse<T>>
)
