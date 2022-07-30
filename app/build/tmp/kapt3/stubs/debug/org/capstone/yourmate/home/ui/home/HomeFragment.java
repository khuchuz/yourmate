package org.capstone.yourmate.home.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020(H\u0016J\u001a\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%\u00a8\u00069"}, d2 = {"Lorg/capstone/yourmate/home/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/capstone/yourmate/databinding/FragmentHomeBinding;", "articleAdapter", "Lorg/capstone/yourmate/adapters/ArticleAdapter;", "getArticleAdapter", "()Lorg/capstone/yourmate/adapters/ArticleAdapter;", "articleAdapter$delegate", "Lkotlin/Lazy;", "authViewModel", "Lorg/capstone/yourmate/viewmodels/AuthViewModel;", "getAuthViewModel", "()Lorg/capstone/yourmate/viewmodels/AuthViewModel;", "authViewModel$delegate", "binding", "getBinding", "()Lorg/capstone/yourmate/databinding/FragmentHomeBinding;", "friendRecommendationAdapter", "Lorg/capstone/yourmate/adapters/FriendRecommendationAdapter;", "getFriendRecommendationAdapter", "()Lorg/capstone/yourmate/adapters/FriendRecommendationAdapter;", "friendRecommendationAdapter$delegate", "homeViewModel", "Lorg/capstone/yourmate/home/ui/home/HomeViewModel;", "getHomeViewModel", "()Lorg/capstone/yourmate/home/ui/home/HomeViewModel;", "homeViewModel$delegate", "placeAdapter", "Lorg/capstone/yourmate/adapters/PlaceAdapter;", "getPlaceAdapter", "()Lorg/capstone/yourmate/adapters/PlaceAdapter;", "placeAdapter$delegate", "spacingItemDecoration", "Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration;", "getSpacingItemDecoration", "()Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration;", "spacingItemDecoration$delegate", "initArticle", "", "initFriend", "userId", "", "initPlace", "initUI", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy homeViewModel$delegate = null;
    private org.capstone.yourmate.databinding.FragmentHomeBinding _binding;
    private final kotlin.Lazy friendRecommendationAdapter$delegate = null;
    private final kotlin.Lazy articleAdapter$delegate = null;
    private final kotlin.Lazy placeAdapter$delegate = null;
    private final kotlin.Lazy spacingItemDecoration$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final org.capstone.yourmate.viewmodels.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final org.capstone.yourmate.home.ui.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    private final org.capstone.yourmate.adapters.FriendRecommendationAdapter getFriendRecommendationAdapter() {
        return null;
    }
    
    private final org.capstone.yourmate.adapters.ArticleAdapter getArticleAdapter() {
        return null;
    }
    
    private final org.capstone.yourmate.adapters.PlaceAdapter getPlaceAdapter() {
        return null;
    }
    
    private final org.capstone.yourmate.item_decoration.SpacingItemDecoration getSpacingItemDecoration() {
        return null;
    }
    
    private final org.capstone.yourmate.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void initFriend(int userId) {
    }
    
    private final void initArticle() {
    }
    
    private final void initPlace() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}