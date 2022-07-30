package org.capstone.yourmate.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lorg/capstone/yourmate/services/YourMateFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "broadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "getBroadcastManager", "()Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "broadcastManager$delegate", "Lkotlin/Lazy;", "broadcastMessage", "", "message", "Lorg/capstone/yourmate/domain/model/Message;", "onMessageReceived", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "onTaskRemoved", "rootIntent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class YourMateFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final kotlin.Lazy broadcastManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.capstone.yourmate.services.YourMateFirebaseMessagingService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECEIVED_MESSAGE_ACTION = "RECEIVED_MESSAGE_ACTION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    
    public YourMateFirebaseMessagingService() {
        super();
    }
    
    private final androidx.localbroadcastmanager.content.LocalBroadcastManager getBroadcastManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage message) {
    }
    
    private final void broadcastMessage(org.capstone.yourmate.domain.model.Message message) {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/capstone/yourmate/services/YourMateFirebaseMessagingService$Companion;", "", "()V", "EXTRA_MESSAGE", "", "RECEIVED_MESSAGE_ACTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}