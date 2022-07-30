package org.capstone.yourmate.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lorg/capstone/yourmate/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/capstone/yourmate/databinding/ActivityHomeBinding;", "chatFragment", "Lorg/capstone/yourmate/home/ui/chat/ChatFragment;", "getChatFragment", "()Lorg/capstone/yourmate/home/ui/chat/ChatFragment;", "chatFragment$delegate", "Lkotlin/Lazy;", "contactFragment", "Lorg/capstone/yourmate/home/ui/contacts/ContactsFragment;", "getContactFragment", "()Lorg/capstone/yourmate/home/ui/contacts/ContactsFragment;", "contactFragment$delegate", "currentFragment", "Landroidx/fragment/app/Fragment;", "homeFragment", "Lorg/capstone/yourmate/home/ui/home/HomeFragment;", "getHomeFragment", "()Lorg/capstone/yourmate/home/ui/home/HomeFragment;", "homeFragment$delegate", "profileFragment", "Lorg/capstone/yourmate/home/ui/profile/ProfileFragment;", "getProfileFragment", "()Lorg/capstone/yourmate/home/ui/profile/ProfileFragment;", "profileFragment$delegate", "initChildFragment", "", "initUI", "navigateToFragment", "fragment", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.capstone.yourmate.databinding.ActivityHomeBinding binding;
    private final kotlin.Lazy homeFragment$delegate = null;
    private final kotlin.Lazy chatFragment$delegate = null;
    private final kotlin.Lazy contactFragment$delegate = null;
    private final kotlin.Lazy profileFragment$delegate = null;
    private androidx.fragment.app.Fragment currentFragment;
    
    public HomeActivity() {
        super();
    }
    
    private final org.capstone.yourmate.home.ui.home.HomeFragment getHomeFragment() {
        return null;
    }
    
    private final org.capstone.yourmate.home.ui.chat.ChatFragment getChatFragment() {
        return null;
    }
    
    private final org.capstone.yourmate.home.ui.contacts.ContactsFragment getContactFragment() {
        return null;
    }
    
    private final org.capstone.yourmate.home.ui.profile.ProfileFragment getProfileFragment() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void initChildFragment() {
    }
    
    private final void navigateToFragment(androidx.fragment.app.Fragment fragment) {
    }
}