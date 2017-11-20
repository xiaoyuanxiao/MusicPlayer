package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IListenerBookRecommendView;
import com.mymusic.musicplayer.okhttp.Moudle.IListenerBookRecommendBiz;
import com.mymusic.musicplayer.okhttp.oncallback.ListenerBookRecommendListener;

/**
 * Created by xiaoyu on 2017/11/20.
 */

public class ListenerBookRecommendPresenter {
    IListenerBookRecommendBiz iListenerBookRecommendBiz;
    IListenerBookRecommendView iListenerBookRecommendView;

    public ListenerBookRecommendPresenter(IListenerBookRecommendView iListenerBookRecommendView) {
        iListenerBookRecommendBiz = IBizFactory.getListenerBookRecommendBiz();
        this.iListenerBookRecommendView = iListenerBookRecommendView;
    }

    public void getdata() {
        iListenerBookRecommendBiz.getdata(new ListenerBookRecommendListener() {
            @Override
            public void onSuccess(RecommendationBean recommendationBean) {
                iListenerBookRecommendView.setBookRecommendationData(recommendationBean);
            }

            @Override
            public void onFailure(String code) {

            }
        });
    }
}
