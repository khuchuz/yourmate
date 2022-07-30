package org.capstone.yourmate.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.capstone.yourmate.data.Resource
import org.capstone.yourmate.domain.model.Place

interface PlaceUseCase {
    fun getPlaces(): Flow<Resource<List<Place>>>
}