package com.mymusic.musicplayer.fragment;

import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.okhttp.Iview.IListenerBookRecommendView;
import com.mymusic.musicplayer.okhttp.Presenter.ListenerBookRecommendPresenter;
import com.mymusic.musicplayer.view.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by xiaoyu on 2017/11/15.
 */

public class ListenerBookFragment extends BaseFragment implements IListenerBookRecommendView {
    private List images = new ArrayList<>();
    private Banner banner;
    private ListenerBookRecommendPresenter listenerBookRecommendPresenter = new ListenerBookRecommendPresenter(this);


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
        listenerBookRecommendPresenter.getdata();
    }


    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void setBookRecommendationData(RecommendationBean recommendationBean) {
        List<RecommendationBean.CarouselsBean> carousels = recommendationBean.getCarousels();
        //增强for循环添加图片路径
        for (RecommendationBean.CarouselsBean element : carousels) {
            String image = element.getImage();
            images.add(image);
        }
        //Banner图片加载，支持手势滑动，支持首尾循环
        banner.setImageLoader(new GlideImageLoader());
        // 设置图片集合
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}