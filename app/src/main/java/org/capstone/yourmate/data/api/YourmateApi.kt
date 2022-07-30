package org.capstone.yourmate.data.api

import org.capstone.yourmate.domain.model.Article
import org.capstone.yourmate.domain.model.Place
import org.capstone.yourmate.domain.model.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface YourmateApi {
    @GET("articles")
    suspend fun getArticles(): Response<BaseListResponse<Article>>

    @GET("tourisms")
    suspend fun getPlaces(): Response<BaseListResponse<Place>>

    @GET("users/{userId}?populate=*")
    suspend fun getUserById(
        @Path("userId") userId: Int
    ): Response<User>
}