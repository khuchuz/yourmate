package org.capstone.yourmate.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/capstone/yourmate/adapters/PlaceAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/capstone/yourmate/domain/model/Place;", "Lorg/capstone/yourmate/adapters/PlaceAdapter$PlaceViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PlaceViewHolder", "app_debug"})
public final class PlaceAdapter extends androidx.recyclerview.widget.ListAdapter<org.capstone.yourmate.domain.model.Place, org.capstone.yourmate.adapters.PlaceAdapter.PlaceViewHolder> {
    
    public PlaceAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.capstone.yourmate.adapters.PlaceAdapter.PlaceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.adapters.PlaceAdapter.PlaceViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/capstone/yourmate/adapters/PlaceAdapter$PlaceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/capstone/yourmate/databinding/LayoutItemPlaceBinding;", "(Lorg/capstone/yourmate/databinding/LayoutItemPlaceBinding;)V", "bind", "", "place", "Lorg/capstone/yourmate/domain/model/Place;", "app_debug"})
    public static final class PlaceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final org.capstone.yourmate.databinding.LayoutItemPlaceBinding binding = null;
        
        public PlaceViewHolder(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.databinding.LayoutItemPlaceBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.capstone.yourmate.domain.model.Place place) {
        }
    }
}