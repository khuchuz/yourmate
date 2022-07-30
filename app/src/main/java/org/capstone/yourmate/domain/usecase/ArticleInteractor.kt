package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.data.repository.ArticleRepository
import org.capstone.yourmate.domain.model.Article
import javax.inject.Inject

class ArticleInteractor @Inject constructor(private val articleRepository: ArticleRepository) :
    ArticleUseCase {
    override fun getArticles(): Flow<Resource<List<Article>>> = articleRepository.getArticles()
}
