package com.udacity.exploreindia.ui.StatesWithCities;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Arun K Babu on 11-May-18.
 */

/**
 * Adds some empty space between the views
 */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public GridSpacingItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;
        outRect.top = 0;
    }
}
