package com.mymusic.musicplayer.mynet;


import com.mymusic.musicplayer.bean.BookListBean;
import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by buring on 2017/5/26.
 */

public interface MyRetroService {
    /**
     * 推荐
     *
     * @return
     */
    @GET("api/recommendations")
    Observable<RecommendationBean> getRecommendData();

    /**
     * 分类
     * @return
     */
    @GET("api/labels")
    Observable<ClassifyBean> getClassifyData();

    /**
     * 书单
     *
     * @return
     */
    @GET("api/booklists")
    Observable<List<BookListBean>> getBookListData();


}
