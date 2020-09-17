package com.algobty.educare.recyclerviews;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class SpacingItemDecorator extends RecyclerView.ItemDecoration {

    private int spanCount;
    private int spacing;
    private boolean includeEdge;

    public SpacingItemDecorator(int spanCount, int spacing, boolean includeEdge) {
        this.spanCount = spanCount;
        this.spacing = spacing;
        this.includeEdge = includeEdge;
    }

    @Override
    public void getItemOffsets(@NonNull @NotNull Rect outRect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView parent, @NonNull @NotNull RecyclerView.State state) {
       int position = parent.getChildAdapterPosition(view);
       int column = position % spanCount;

       if (includeEdge){
           outRect.left = spacing - column * spacing / spanCount;
           outRect.right = (column + 1) * spacing / spanCount;

           if (position < spanCount){
               outRect.top = spacing;
           }
           outRect.bottom = spacing;
       }
       else {
           outRect.left = column * spacing / spanCount;
           outRect.right = spacing - (column + 1) * spacing / spanCount;
           if (position >= spanCount){
               outRect.top = spacing;
           }
       }
    }
}
