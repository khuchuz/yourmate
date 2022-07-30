package org.capstone.yourmate.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/capstone/yourmate/domain/usecase/PlaceInteractor;", "Lorg/capstone/yourmate/domain/usecase/PlaceUseCase;", "placeRepository", "Lorg/capstone/yourmate/data/repository/PlaceRepository;", "(Lorg/capstone/yourmate/data/repository/PlaceRepository;)V", "getPlaces", "Lkotlinx/coroutines/flow/Flow;", "Lorg/capstone/yourmate/data/Resource;", "", "Lorg/capstone/yourmate/domain/model/Place;", "app_debug"})
public final class PlaceInteractor implements org.capstone.yourmate.domain.usecase.PlaceUseCase {
    private final org.capstone.yourmate.data.repository.PlaceRepository placeRepository = null;
    
    @javax.inject.Inject()
    public PlaceInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.PlaceRepository placeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Place>>> getPlaces() {
        return null;
    }
}