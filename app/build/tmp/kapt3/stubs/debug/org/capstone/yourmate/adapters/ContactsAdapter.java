package org.capstone.yourmate.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/capstone/yourmate/adapters/ContactsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/capstone/yourmate/domain/model/User;", "Lorg/capstone/yourmate/adapters/ContactsAdapter$ContactViewHolder;", "()V", "onClickListener", "Lkotlin/Function1;", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "action", "ContactViewHolder", "app_debug"})
public final class ContactsAdapter extends androidx.recyclerview.widget.ListAdapter<org.capstone.yourmate.domain.model.User, org.capstone.yourmate.adapters.ContactsAdapter.ContactViewHolder> {
    private kotlin.jvm.functions.Function1<? super org.capstone.yourmate.domain.model.User, kotlin.Unit> onClickListener;
    
    public ContactsAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.capstone.yourmate.adapters.ContactsAdapter.ContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.adapters.ContactsAdapter.ContactViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.capstone.yourmate.adapters.ContactsAdapter setOnClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.capstone.yourmate.domain.model.User, kotlin.Unit> action) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/capstone/yourmate/adapters/ContactsAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/capstone/yourmate/databinding/LayoutItemContactBinding;", "(Lorg/capstone/yourmate/adapters/ContactsAdapter;Lorg/capstone/yourmate/databinding/LayoutItemContactBinding;)V", "bind", "", "user", "Lorg/capstone/yourmate/domain/model/User;", "app_debug"})
    public final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final org.capstone.yourmate.databinding.LayoutItemContactBinding binding = null;
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.databinding.LayoutItemContactBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.domain.model.User user) {
        }
    }
}