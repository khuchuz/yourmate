package org.capstone.yourmate.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0011\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/capstone/yourmate/adapters/MessageAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/capstone/yourmate/domain/model/Message;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "addItem", "", "message", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ReceivedMessageViewHolder", "SentMessageViewHolder", "app_debug"})
public final class MessageAdapter extends androidx.recyclerview.widget.ListAdapter<org.capstone.yourmate.domain.model.Message, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final org.capstone.yourmate.adapters.MessageAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_MESSAGE_SENT = 1;
    private static final int VIEW_TYPE_MESSAGE_RECEIVED = 2;
    
    public MessageAdapter() {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.model.Message message) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/capstone/yourmate/adapters/MessageAdapter$SentMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/capstone/yourmate/databinding/LayoutItemSentChatBinding;", "(Lorg/capstone/yourmate/databinding/LayoutItemSentChatBinding;)V", "bind", "", "message", "Lorg/capstone/yourmate/domain/model/Message;", "app_debug"})
    public static final class SentMessageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final org.capstone.yourmate.databinding.LayoutItemSentChatBinding binding = null;
        
        public SentMessageViewHolder(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.databinding.LayoutItemSentChatBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.domain.model.Message message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/capstone/yourmate/adapters/MessageAdapter$ReceivedMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/capstone/yourmate/databinding/LayoutItemReceivedChatBinding;", "(Lorg/capstone/yourmate/databinding/LayoutItemReceivedChatBinding;)V", "bind", "", "message", "Lorg/capstone/yourmate/domain/model/Message;", "app_debug"})
    public static final class ReceivedMessageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final org.capstone.yourmate.databinding.LayoutItemReceivedChatBinding binding = null;
        
        public ReceivedMessageViewHolder(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.databinding.LayoutItemReceivedChatBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.domain.model.Message message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/capstone/yourmate/adapters/MessageAdapter$Companion;", "", "()V", "VIEW_TYPE_MESSAGE_RECEIVED", "", "VIEW_TYPE_MESSAGE_SENT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}