package org.capstone.yourmate.di.koin

//val firebaseModule = module {
//    single { FirebaseDatabase.getInstance() }
//    single { FirebaseAuth.getInstance() }
//}
//
//val repositoryModule = module {
//    single<IAuthRepository> {
//        AuthRepository(
//            get(), get()
//        )
//    }
//    single<IContactRepository> {
//        ContactRepository(
//            get(), get()
//        )
//    }
//    single<IChatRepository> {
//        ChatRepository(
//            get(), get()
//        )
//    }
//}
//
//val useCaseModule = module {
//    factory<AuthUseCase> { AuthInteractor(get()) }
//    factory<ContactUseCase> { ContactInteractor(get()) }
//    factory<ChatUseCase> { ChatInteractor(get()) }
//}
//
//val viewModelModule = module {
//    viewModel { AuthViewModel(get()) }
//    viewModel { ContactsViewModel(get()) }
//    viewModel { ChatViewModel(get()) }
//}