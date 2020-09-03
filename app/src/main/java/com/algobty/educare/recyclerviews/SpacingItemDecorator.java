package com.algobty.educare.recyclerviews;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class SpacingItemDecorator extends RecyclerView.ItemDecoration {

    private int space;

    public SpacingItemDecorator(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(@NonNull @NotNull Rect outRect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView parent, @NonNull @NotNull RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;

        if (parent.getChildLayoutPosition(view) == 0){
            outRect.top = space;
        }
        else {
            outRect.top = 0;
        }
    }
}
