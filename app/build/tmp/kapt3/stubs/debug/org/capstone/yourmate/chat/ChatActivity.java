package org.capstone.yourmate.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\"H\u0002J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lorg/capstone/yourmate/chat/ChatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/capstone/yourmate/databinding/ActivityChatBinding;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "getBroadcastReceiver", "()Landroid/content/BroadcastReceiver;", "broadcastReceiver$delegate", "Lkotlin/Lazy;", "chatViewModel", "Lorg/capstone/yourmate/viewmodels/ChatViewModel;", "getChatViewModel", "()Lorg/capstone/yourmate/viewmodels/ChatViewModel;", "chatViewModel$delegate", "messageAdapter", "Lorg/capstone/yourmate/adapters/MessageAdapter;", "getMessageAdapter", "()Lorg/capstone/yourmate/adapters/MessageAdapter;", "messageAdapter$delegate", "selectedContact", "Lorg/capstone/yourmate/domain/model/User;", "spacingItemDecoration", "Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration;", "getSpacingItemDecoration", "()Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration;", "spacingItemDecoration$delegate", "evalNegativeMessage", "", "messages", "", "Lorg/capstone/yourmate/domain/model/Message;", "initUI", "", "loadMessages", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "sendMessage", "setNegativeStatus", "status", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ChatActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy chatViewModel$delegate = null;
    private org.capstone.yourmate.databinding.ActivityChatBinding binding;
    private final kotlin.Lazy spacingItemDecoration$delegate = null;
    private final kotlin.Lazy messageAdapter$delegate = null;
    private final kotlin.Lazy broadcastReceiver$delegate = null;
    private org.capstone.yourmate.domain.model.User selectedContact;
    @org.jetbrains.annotations.NotNull()
    public static final org.capstone.yourmate.chat.ChatActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_USER = "extra_user";
    
    public ChatActivity() {
        super();
    }
    
    private final org.capstone.yourmate.viewmodels.ChatViewModel getChatViewModel() {
        return null;
    }
    
    private final org.capstone.yourmate.item_decoration.SpacingItemDecoration getSpacingItemDecoration() {
        return null;
    }
    
    private final org.capstone.yourmate.adapters.MessageAdapter getMessageAdapter() {
        return null;
    }
    
    private final android.content.BroadcastReceiver getBroadcastReceiver() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void sendMessage() {
    }
    
    private final void loadMessages() {
    }
    
    private final int evalNegativeMessage(java.util.List<org.capstone.yourmate.domain.model.Message> messages) {
        return 0;
    }
    
    private final void setNegativeStatus(int status) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/capstone/yourmate/chat/ChatActivity$Companion;", "", "()V", "EXTRA_USER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}