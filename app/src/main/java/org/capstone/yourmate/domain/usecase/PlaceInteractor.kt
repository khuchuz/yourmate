package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.data.repository.PlaceRepository
import org.capstone.yourmate.domain.model.Place
import javax.inject.Inject

class PlaceInteractor @Inject constructor(private val placeRepository: PlaceRepository) :
    PlaceUseCase {
    override fun getPlaces(): Flow<Resource<List<Place>>> = placeRepository.getPlaces()
}