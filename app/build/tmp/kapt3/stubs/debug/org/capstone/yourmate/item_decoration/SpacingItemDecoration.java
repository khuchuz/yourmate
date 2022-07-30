package org.capstone.yourmate.item_decoration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "space", "", "orientation", "Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration$ORIENTATION;", "(ILorg/capstone/yourmate/item_decoration/SpacingItemDecoration$ORIENTATION;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ORIENTATION", "app_debug"})
public final class SpacingItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final int space = 0;
    private final org.capstone.yourmate.item_decoration.SpacingItemDecoration.ORIENTATION orientation = null;
    
    public SpacingItemDecoration() {
        super();
    }
    
    public SpacingItemDecoration(int space, @org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.item_decoration.SpacingItemDecoration.ORIENTATION orientation) {
        super();
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/capstone/yourmate/item_decoration/SpacingItemDecoration$ORIENTATION;", "", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "app_debug"})
    public static enum ORIENTATION {
        /*public static final*/ VERTICAL /* = new VERTICAL() */,
        /*public static final*/ HORIZONTAL /* = new HORIZONTAL() */;
        
        ORIENTATION() {
        }
    }
}