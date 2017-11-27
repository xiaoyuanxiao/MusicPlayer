package com.mymusic.musicplayer.utils;

import android.content.Context;
import android.widget.TextView;

import com.mymusic.musicplayer.R;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class TextcolorUtil {
    public static void setTextColor(Context context, int index, TextView... textViews) {
        for (int i = 0; i < textViews.length; i++) {
            if (i == index) {
                textViews[i].setTextColor(context.getResources().getColor(R.color.main_buttomtext_yellow));
            } else {
                textViews[i].setTextColor(context.getResources().getColor(R.color.main_buttomtext_grey));
            }
        }
    }
}
