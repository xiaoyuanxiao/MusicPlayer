package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.RecommendationBean;

/**
 * Created by xiaoyu on 2017/11/20.
 */

public interface ListenerBookRecommendListener extends BaseOnlistener {
    void onSuccess(RecommendationBean recommendationBean);
}
