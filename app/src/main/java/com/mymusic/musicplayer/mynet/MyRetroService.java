package com.mymusic.musicplayer.mynet;


import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.bean.RecommendationBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by buring on 2017/5/26.
 */

public interface MyRetroService {

    @GET("api/recommendations")
    Observable<RecommendationBean> getRecommendData();

    @GET("api/labels")
    Observable<ClassifyBean> getClassifyData();


}
