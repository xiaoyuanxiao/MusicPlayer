package com.mymusic.musicplayer.fragment;

import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.view.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/11/15.
 */

public class ListenerBookFragment extends BaseFragment {
    private List images = new ArrayList<>();
    private Banner banner;

    public static ListenerBookFragment newInstance() {
        ListenerBookFragment listenerBookFragment = new ListenerBookFragment();
        return listenerBookFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getContext(), R.layout.fragment_listenerbook, null);
        banner = (Banner) inflate.findViewById(R.id.banner);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();

        images.add("http://jyts-public-oss.longruncloud.com/carousel/2017/07/05/7a55c7fd9e6cafe15cd9301c838ace8689598b1cbbabc319a63af7489bea659c.jpg");
        images.add("http://jyts-public-oss.longruncloud.com/carousel/2017/07/05/7a55c7fd9e6cafe15cd9301c838ace8689598b1cbbabc319a63af7489bea659c.jpg");
        images.add("http://jyts-public-oss.longruncloud.com/carousel/2017/07/05/7a55c7fd9e6cafe15cd9301c838ace8689598b1cbbabc319a63af7489bea659c.jpg");
        images.add("http://jyts-public-oss.longruncloud.com/carousel/2017/07/05/7a55c7fd9e6cafe15cd9301c838ace8689598b1cbbabc319a63af7489bea659c.jpg");

        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        // 设置图片集合
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();


    }


    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }
}