package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IListenerBookRecommendView;
import com.mymusic.musicplayer.okhttp.Moudle.IListenerBookRecommendBiz;
import com.mymusic.musicplayer.okhttp.oncallback.ListenerBookRecommendListener;

import java.util.List;

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
        iListenerBookRecommendBiz.getAlldata(new ListenerBookRecommendListener() {
            @Override
            public void onSuccess(RecommendationBean recommendationBean) {
                List<RecommendationBean.CarouselsBean> carousels = recommendationBean.getCarousels();
                List<RecommendationBean.HotBooklistsBean> hot_booklists = recommendationBean.getHot_booklists();
                List<RecommendationBean.TopicsBean> topics = recommendationBean.getTopics();
                List<RecommendationBean.RecommendationsBean> recommendations = recommendationBean.getRecommendations();
                List<RecommendationBean.NewArrivalsBean> new_arrivals = recommendationBean.getNew_arrivals();
                List<RecommendationBean.HotRecordersBean> hot_recorders = recommendationBean.getHot_recorders();
                List<RecommendationBean.BestAuthorsBean> best_authors = recommendationBean.getBest_authors();
                List<RecommendationBean.HotHitsBean> hot_hits = recommendationBean.getHot_hits();
                List<RecommendationBean.EditorsPicksBean> editors_picks = recommendationBean.getEditors_picks();
                iListenerBookRecommendView.setBookRecommendCarousels(carousels);
                iListenerBookRecommendView.setBookRecommendHotBooklists(hot_booklists);
                iListenerBookRecommendView.setBookRecommendTopics(topics);
                iListenerBookRecommendView.setBookRecommendRecommendations(recommendations);
                iListenerBookRecommendView.setBookRecommendNewArrivals(new_arrivals);
                iListenerBookRecommendView.setBookRecommendHotRecorders(hot_recorders);
                iListenerBookRecommendView.setBookRecommendBestAuthors(best_authors);
                iListenerBookRecommendView.setBookRecommendHotHits(hot_hits);
                iListenerBookRecommendView.setBookRecommendEditorspicks(editors_picks);

            }

            @Override
            public void onFailure(String code) {

            }
        });
    }
}
