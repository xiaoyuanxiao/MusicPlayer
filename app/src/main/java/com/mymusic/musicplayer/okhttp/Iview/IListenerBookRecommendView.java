package com.mymusic.musicplayer.okhttp.Iview;

import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/20.
 */

public interface IListenerBookRecommendView {
    void setBookRecommendCarousels(List<RecommendationBean.CarouselsBean> carouselsBean);

    void setBookRecommendHotBooklists(List<RecommendationBean.HotBooklistsBean> hotBooklists);

    void setBookRecommendEditorspicks(List<RecommendationBean.EditorsPicksBean> editorspicks);

    void setBookRecommendTopics(List<RecommendationBean.TopicsBean> topics);

    void setBookRecommendHotHits(List<RecommendationBean.HotHitsBean> hotHits);

    void setBookRecommendNewArrivals(List<RecommendationBean.NewArrivalsBean> newArrivalsBeen);

    void setBookRecommendBestAuthors(List<RecommendationBean.BestAuthorsBean> bestAuthors);

    void setBookRecommendHotRecorders(List<RecommendationBean.HotRecordersBean> hotRecorders);

    void setBookRecommendRecommendations(List<RecommendationBean.RecommendationsBean> recommendations);
}
