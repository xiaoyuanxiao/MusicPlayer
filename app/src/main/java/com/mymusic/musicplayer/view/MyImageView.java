package com.mymusic.musicplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by xiaoyu on 2017/11/23.
 */

public class MyImageView extends ImageView {

    public MyImageView(Context context, AttributeSet attrs) {

        super(context, attrs);

    }

    public MyImageView(Context context) {

        super(context);

    }

    @Override

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        setMeasuredDimension(getDefaultSize(0, widthMeasureSpec),

                getDefaultSize(0, heightMeasureSpec));

        int childWidthSize = getMeasuredWidth();

        int childHeightSize = getMeasuredHeight();

// 高度和宽度一样

        heightMeasureSpec = widthMeasureSpec = MeasureSpec.makeMeasureSpec(

                childWidthSize, MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

}