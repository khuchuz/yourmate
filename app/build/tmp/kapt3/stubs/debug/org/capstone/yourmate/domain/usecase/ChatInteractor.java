package org.capstone.yourmate.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u0006H\u0016J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J,\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/capstone/yourmate/domain/usecase/ChatInteractor;", "Lorg/capstone/yourmate/domain/usecase/ChatUseCase;", "chatRepository", "Lorg/capstone/yourmate/domain/repository/IChatRepository;", "(Lorg/capstone/yourmate/domain/repository/IChatRepository;)V", "getAllChats", "Lkotlinx/coroutines/flow/Flow;", "Lorg/capstone/yourmate/data/Resource;", "", "Lorg/capstone/yourmate/domain/model/User;", "getLastChats", "Lorg/capstone/yourmate/domain/model/Message;", "getMessagesWith", "userId", "", "sendMessageTo", "message", "messagingToken", "app_debug"})
public final class ChatInteractor implements org.capstone.yourmate.domain.usecase.ChatUseCase {
    private final org.capstone.yourmate.domain.repository.IChatRepository chatRepository = null;
    
    @javax.inject.Inject()
    public ChatInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.repository.IChatRepository chatRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Message>>> getMessagesWith(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<org.capstone.yourmate.data.Resource<org.capstone.yourmate.domain.model.Message>> sendMessageTo(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String messagingToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Message>>> getLastChats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.User>>> getAllChats() {
        return null;
    }
}