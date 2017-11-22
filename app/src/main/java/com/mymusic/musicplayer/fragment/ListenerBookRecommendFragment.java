package com.mymusic.musicplayer.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.RecommendBestAuthorsAdapter;
import com.mymusic.musicplayer.adapter.RecommendEditorsPicksAdapter;
import com.mymusic.musicplayer.adapter.RecommendHotBooklistsAdapter;
import com.mymusic.musicplayer.adapter.RecommendHothitsAdapter;
import com.mymusic.musicplayer.adapter.RecommendNewarrivalsAdapter;
import com.mymusic.musicplayer.adapter.RecommendRecommendationsOneAdapter;
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
    private RecyclerView rv_recommend_hotlists, rv_recommend_editorspicks, rv_recommend_hothits, rv_recommend_newarrivals,
            rv_recommend_bestauthors, rv_recommend_JYWX;
    private RecyclerView.LayoutManager HotBooklistsLayoutManager;
    private RecyclerView.LayoutManager EditorsPicksLayoutManager;
    private GridLayoutManager HothitsLayoutManager;
    private GridLayoutManager NewarrivalsLayoutManager;
    private GridLayoutManager BestAuthorsLayoutManager;
    private GridLayoutManager RecommendationsLayoutManager;

    RecommendHotBooklistsAdapter recommendHotBooklistsAdapter;
    private List<RecommendationBean.HotBooklistsBean> hotBooklists;


    private RecommendEditorsPicksAdapter recommendEditorsPicksAdapter;
    private List<RecommendationBean.EditorsPicksBean> editorsPickslists;

    private ImageView iv_topics_one, iv_topics_two;

    private RecommendHothitsAdapter recommendHothitsAdapter;
    private List<RecommendationBean.HotHitsBean> hotHitslists;

    private RecommendNewarrivalsAdapter recommendNewarrivalsAdapter;
    private List<RecommendationBean.NewArrivalsBean> newArrivalslists;

    private RecommendBestAuthorsAdapter recommendBestAuthorsAdapter;
    private List<RecommendationBean.BestAuthorsBean> bestAuthorslists;

    private RecommendRecommendationsOneAdapter recommendRecommendationsOneAdapter;
    private List<RecommendationBean.RecommendationsBean.BooksBeanOne> recommendationslists;


    public static ListenerBookRecommendFragment newInstance() {
        ListenerBookRecommendFragment listenerBookRecommendFragment = new ListenerBookRecommendFragment();
        return listenerBookRecommendFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbookrecommend, null);
        rv_recommend_hotlists = (RecyclerView) inflate.findViewById(R.id.rv_recommend_hotlists);
        rv_recommend_editorspicks = (RecyclerView) inflate.findViewById(R.id.rv_recommend_editorspicks);
        rv_recommend_hothits = (RecyclerView) inflate.findViewById(R.id.rv_recommend_hothits);
        rv_recommend_newarrivals = (RecyclerView) inflate.findViewById(R.id.rv_recommend_newarrivals);
        rv_recommend_bestauthors = (RecyclerView) inflate.findViewById(R.id.rv_recommend_bestauthors);
        rv_recommend_JYWX = (RecyclerView) inflate.findViewById(R.id.rv_recommend_JYWX);

        iv_topics_one = (ImageView) inflate.findViewById(R.id.iv_topics_one);
        iv_topics_two = (ImageView) inflate.findViewById(R.id.iv_topics_two);
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
        HotBooklistsLayoutManager = new LinearLayoutManager(getActivity());
        rv_recommend_hotlists.setLayoutManager(HotBooklistsLayoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        rv_recommend_hotlists.setHasFixedSize(true);

        recommendHotBooklistsAdapter = new RecommendHotBooklistsAdapter(hotBooklists);
        rv_recommend_hotlists.setAdapter(recommendHotBooklistsAdapter);
        /**
         * 编辑推荐
         */
        editorsPickslists = new ArrayList<>();
        EditorsPicksLayoutManager = new LinearLayoutManager(getActivity());
        rv_recommend_editorspicks.setLayoutManager(EditorsPicksLayoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        rv_recommend_editorspicks.setHasFixedSize(true);
        recommendEditorsPicksAdapter = new RecommendEditorsPicksAdapter(editorsPickslists);
        rv_recommend_editorspicks.setAdapter(recommendEditorsPicksAdapter);

        /**
         * 大家都在听
         */
        hotHitslists = new ArrayList<>();
        recommendHothitsAdapter = new RecommendHothitsAdapter(hotHitslists);
        HothitsLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_recommend_hothits.setLayoutManager(HothitsLayoutManager);
        rv_recommend_hothits.setAdapter(recommendHothitsAdapter);

        /**
         * 最新上架
         */
        newArrivalslists = new ArrayList<>();
        recommendNewarrivalsAdapter = new RecommendNewarrivalsAdapter(newArrivalslists);
        NewarrivalsLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_recommend_newarrivals.setLayoutManager(NewarrivalsLayoutManager);
        rv_recommend_newarrivals.setAdapter(recommendNewarrivalsAdapter);

        /**
         * 名家名作
         */
        bestAuthorslists = new ArrayList<>();
        recommendBestAuthorsAdapter = new RecommendBestAuthorsAdapter(bestAuthorslists);
        BestAuthorsLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_recommend_bestauthors.setLayoutManager(BestAuthorsLayoutManager);
        rv_recommend_bestauthors.setAdapter(recommendBestAuthorsAdapter);

        /**
         * 个性推荐
         */
        recommendationslists = new ArrayList<>();
        recommendRecommendationsOneAdapter = new RecommendRecommendationsOneAdapter(recommendationslists);
        RecommendationsLayoutManager = new GridLayoutManager(getActivity(), 4);
        rv_recommend_JYWX.setLayoutManager(RecommendationsLayoutManager);
        rv_recommend_JYWX.setAdapter(recommendRecommendationsOneAdapter);

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

    /**
     * 图片主题
     *
     * @param topics
     */
    @Override
    public void setBookRecommendTopics(List<RecommendationBean.TopicsBean> topics) {
        Glide.with(this).load(topics.get(0).getCover()).into(iv_topics_one);
        Glide.with(this).load(topics.get(1).getCover()).into(iv_topics_two);
//        Glide.with(this).load(topics.get(0).getCover()).into(iv_topics_one);
//        Glide.with(this).load(topics.get(0).getCover()).into(iv_topics_one);
//        Glide.with(this).load(topics.get(0).getCover()).into(iv_topics_one);
//        Glide.with(this).load(topics.get(0).getCover()).into(iv_topics_one);
    }

    /**
     * 大家都在听
     *
     * @param hotHits
     */
    @Override
    public void setBookRecommendHotHits(List<RecommendationBean.HotHitsBean> hotHits) {
        hotHitslists.clear();
        hotHitslists.addAll(hotHits);
        recommendHothitsAdapter.notifyDataSetChanged();
    }

    /**
     * 最新上架
     *
     * @param newArrivalsBeen
     */
    @Override
    public void setBookRecommendNewArrivals(List<RecommendationBean.NewArrivalsBean> newArrivalsBeen) {
        newArrivalslists.clear();
        newArrivalslists.addAll(newArrivalsBeen);
        recommendNewarrivalsAdapter.notifyDataSetChanged();
    }

    /**
     * 名家名作
     * @param bestAuthors
     */
    @Override
    public void setBookRecommendBestAuthors(List<RecommendationBean.BestAuthorsBean> bestAuthors) {
        bestAuthorslists.clear();
        bestAuthorslists.addAll(bestAuthors);
        recommendBestAuthorsAdapter.notifyDataSetChanged();
    }

    @Override
    public void setBookRecommendHotRecorders(List<RecommendationBean.HotRecordersBean> hotRecorders) {

    }

    /**
     * 个性推荐
     * @param recommendations
     */
    @Override
    public void setBookRecommendRecommendations(List<RecommendationBean.RecommendationsBean> recommendations) {
        List<RecommendationBean.RecommendationsBean.BooksBeanOne> books = recommendations.get(0).getBooks();
        recommendationslists.clear();
        recommendationslists.addAll(books);
        recommendRecommendationsOneAdapter.notifyDataSetChanged();
    }
}