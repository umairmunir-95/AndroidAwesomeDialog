package com.umairmunirahmad.androidawesomedialoglibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

public class ColorManager {

    public static int fetchPrimaryColor(Context context) {
        TypedValue typedValue = new TypedValue();
        TypedArray typedArray = context.obtainStyledAttributes(typedValue.data, new int[] { R.attr.colorPrimary });
        int color = typedArray.getColor(0, 0);
        typedArray.recycle();
        return color;
    }
}
