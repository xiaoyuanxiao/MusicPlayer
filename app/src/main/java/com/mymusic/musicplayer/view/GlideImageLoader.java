package com.mymusic.musicplayer.view;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by xiaoyu on 2017/11/15.
 */

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         图片加载方式由自己选择，我用的是glide
         */
        Glide.with(context).load(path).into(imageView);
    }
}
