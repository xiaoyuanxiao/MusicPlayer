package com.mymusic.musicplayer.mynet;


import com.mymusic.musicplayer.bean.AudioUrlBean;
import com.mymusic.musicplayer.bean.BookListBean;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.bean.RankingBean;
import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
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
     *
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

    /**
     * 榜单
     *
     * @return
     */
    @GET("api/ranks")
    Observable<RankingBean> getRankData();

    /**
     * 榜单详情
     */
    @GET("api/book")
    Observable<BookRankDetailsBean> getRankDetailsData(@Query("id") int id);

    /**
     * 图片资源
     */
    @GET("api/play")
    Observable<AudioUrlBean> getAudioUrl(@Query("id") int id, @Query("type") String type);


}
