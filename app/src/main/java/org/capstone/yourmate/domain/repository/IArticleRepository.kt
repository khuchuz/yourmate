package org.capstone.yourmate.domain.repository

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.Article

interface IArticleRepository {
    fun getArticles(): Flow<Resource<List<Article>>>
}