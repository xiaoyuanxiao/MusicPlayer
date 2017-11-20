package com.mymusic.musicplayer.fragment;

import android.view.View;
import android.widget.ListView;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.RecommendEditorsPicksAdapter;
import com.mymusic.musicplayer.adapter.RecommendHotBooklistsAdapter;
import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.okhttp.Iview.IListenerBookRecommendView;
import com.mymusic.musicplayer.okhttp.Presenter.ListenerBookRecommendPresenter;
import com.mymusic.musicplayer.view.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/11/20.
 */

public class ListenerBookRecommendFragment extends BaseFragment implements IListenerBookRecommendView {
    private List images = new ArrayList<>();
    private Banner banner;
    private ListenerBookRecommendPresenter listenerBookRecommendPresenter = new ListenerBookRecommendPresenter(this);
    private ListView lv_recommend_hotlists, lv_recommend_editorspicks;
    RecommendHotBooklistsAdapter recommendHotBooklistsAdapter;
    private List<RecommendationBean.HotBooklistsBean> hotBooklists;


    private RecommendEditorsPicksAdapter recommendEditorsPicksAdapter;
    private List<RecommendationBean.EditorsPicksBean> editorsPickslists;



    public static ListenerBookRecommendFragment newInstance() {
        ListenerBookRecommendFragment listenerBookRecommendFragment = new ListenerBookRecommendFragment();
        return listenerBookRecommendFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbookrecommend, null);
        lv_recommend_hotlists = (ListView) inflate.findViewById(R.id.lv_recommend_hotlists);
        lv_recommend_editorspicks = (ListView) inflate.findViewById(R.id.lv_recommend_editorspicks);
        banner = (Banner) inflate.findViewById(R.id.banner);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        /**
         * 精选书单
         */
        hotBooklists = new ArrayList<>();
        recommendHotBooklistsAdapter = new RecommendHotBooklistsAdapter(getActivity(), hotBooklists);
        lv_recommend_hotlists.setAdapter(recommendHotBooklistsAdapter);
        /**
         * 编辑推荐
         */
        editorsPickslists = new ArrayList<>();
        recommendEditorsPicksAdapter = new RecommendEditorsPicksAdapter(getActivity(), editorsPickslists);
        lv_recommend_editorspicks.setAdapter(recommendEditorsPicksAdapter);

        listenerBookRecommendPresenter.getdata();
    }


    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }

    /**
     * 首页轮播图
     *
     * @param carouselsBean
     */
    @Override
    public void setBookRecommendCarousels(List<RecommendationBean.CarouselsBean> carouselsBean) {
        for (RecommendationBean.CarouselsBean element : carouselsBean) {
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

    /**
     * 精选书单
     */
    @Override
    public void setBookRecommendHotBooklists(List<RecommendationBean.HotBooklistsBean> hotBooklists) {
        this.hotBooklists.clear();
        this.hotBooklists.addAll(hotBooklists);
        recommendHotBooklistsAdapter.notifyDataSetChanged();

    }

    /**
     * 编辑推荐
     *
     * @param editorspicks
     */
    @Override
    public void setBookRecommendEditorspicks(List<RecommendationBean.EditorsPicksBean> editorspicks) {
        editorsPickslists.clear();
        editorsPickslists.addAll(editorspicks);
        recommendEditorsPicksAdapter.notifyDataSetChanged();
    }

    @Override
    public void setBookRecommendTopics(List<RecommendationBean.TopicsBean> topics) {

    }

    @Override
    public void setBookRecommendHotHits(List<RecommendationBean.HotHitsBean> hotHits) {

    }

    @Override
    public void setBookRecommendNewArrivals(List<RecommendationBean.NewArrivalsBean> newArrivalsBeen) {

    }

    @Override
    public void setBookRecommendBestAuthors(List<RecommendationBean.BestAuthorsBean> bestAuthors) {

    }

    @Override
    public void setBookRecommendHotRecorders(List<RecommendationBean.HotRecordersBean> hotRecorders) {

    }

    @Override
    public void setBookRecommendRecommendations(List<RecommendationBean.RecommendationsBean> recommendations) {

    }
}