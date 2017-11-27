package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.ListenerBookRecommendListener;

import rx.Observable;

/**
 * Created by xiaoyu on 2017/11/20.
 */

public class BizListenerBookRecommend implements IListenerBookRecommendBiz {
    private static BizListenerBookRecommend testMoudle;

    public synchronized static BizListenerBookRecommend getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizListenerBookRecommend();
        return testMoudle;
    }

    @Override
    public void getAlldata(final ListenerBookRecommendListener listenerBookRecommendListener) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<RecommendationBean>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(RecommendationBean recommendationBean) {
                listenerBookRecommendListener.onSuccess(recommendationBean);
            }

            @Override
            public Observable<RecommendationBean> getObservable(MyRetroService retrofit) {
                return retrofit.getRecommendData();
            }
        });
    }
}
