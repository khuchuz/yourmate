package org.capstone.yourmate.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/capstone/yourmate/viewmodels/ContactsViewModel;", "Landroidx/lifecycle/ViewModel;", "contactUseCase", "Lorg/capstone/yourmate/domain/usecase/ContactUseCase;", "(Lorg/capstone/yourmate/domain/usecase/ContactUseCase;)V", "getAllContacts", "Landroidx/lifecycle/LiveData;", "Lorg/capstone/yourmate/data/Resource;", "", "Lorg/capstone/yourmate/domain/model/User;", "app_debug"})
public final class ContactsViewModel extends androidx.lifecycle.ViewModel {
    private final org.capstone.yourmate.domain.usecase.ContactUseCase contactUseCase = null;
    
    @javax.inject.Inject()
    public ContactsViewModel(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.ContactUseCase contactUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.User>>> getAllContacts() {
        return null;
    }
}