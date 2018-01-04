package com.mymusic.musicplayer.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.RecommendBestAuthorsAdapter;
import com.mymusic.musicplayer.adapter.RecommendEditorsPicksAdapter;
import com.mymusic.musicplayer.adapter.RecommendHotBooklistsAdapter;
import com.mymusic.musicplayer.adapter.RecommendHotRecordersAdapter;
import com.mymusic.musicplayer.adapter.RecommendHothitsAdapter;
import com.mymusic.musicplayer.adapter.RecommendNewarrivalsAdapter;
import com.mymusic.musicplayer.adapter.RecommendRecommendationsAdapter;
import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.okhttp.Iview.IListenerBookRecommendView;
import com.mymusic.musicplayer.okhttp.Presenter.ListenerBookRecommendPresenter;
import com.mymusic.musicplayer.utils.DynamicTimeFormat;
import com.mymusic.musicplayer.view.FullyGridLayoutManager;
import com.mymusic.musicplayer.view.FullyLinearLayoutManager;
import com.mymusic.musicplayer.view.GlideImageLoader;
import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
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
            rv_recommend_bestauthors, rv_recommend_hotrecorders, rv_recommend_JYWX, rv_recommend_WXSJ, rv_recommend_SDMZ;
    private FullyLinearLayoutManager HotBooklistsLayoutManager;
    private FullyLinearLayoutManager EditorsPicksLayoutManager;
    private FullyLinearLayoutManager HotRecordersLayoutManager;
    private FullyGridLayoutManager HothitsLayoutManager;
    private FullyGridLayoutManager NewarrivalsLayoutManager;
    private FullyGridLayoutManager BestAuthorsLayoutManager;
    private FullyGridLayoutManager RecommendationsJYWXLayoutManager;
    private FullyGridLayoutManager RecommendationsWXSJLayoutManager;
    private FullyGridLayoutManager RecommendationsSDMZLayoutManager;
    LinearLayout ll_fg_lintenerbookrecommend;
    RecommendHotBooklistsAdapter recommendHotBooklistsAdapter;
    private List<RecommendationBean.HotBooklistsBean> hotBooklists;


    private RecommendEditorsPicksAdapter recommendEditorsPicksAdapter;
    private List<RecommendationBean.EditorsPicksBean> editorsPickslists;

    private ImageView iv_topics_one, iv_topics_two, iv_topics_three, iv_topics_four, iv_topics_five, iv_topics_six;

    private RecommendHothitsAdapter recommendHothitsAdapter;
    private List<RecommendationBean.HotHitsBean> hotHitslists;

    private RecommendNewarrivalsAdapter recommendNewarrivalsAdapter;
    private List<RecommendationBean.NewArrivalsBean> newArrivalslists;

    private RecommendBestAuthorsAdapter recommendBestAuthorsAdapter;
    private List<RecommendationBean.BestAuthorsBean> bestAuthorslists;

    private RecommendHotRecordersAdapter recommendHotRecordersAdapter;
    private List<RecommendationBean.HotRecordersBean> hotRecorderslists;

    private RecommendRecommendationsAdapter recommendRecommendationsJYWXAdapter;
    private RecommendRecommendationsAdapter recommendRecommendationsWXSJAdapter;
    private RecommendRecommendationsAdapter recommendRecommendationsSDMZAdapter;
    private List<RecommendationBean.RecommendationsBean.BooksBeanOne> recommendationsjywxlists;
    private List<RecommendationBean.RecommendationsBean.BooksBeanOne> recommendationswxsjlists;
    private List<RecommendationBean.RecommendationsBean.BooksBeanOne> recommendationssdmzlists;
    private RefreshLayout mRefreshLayout;
    private ClassicsHeader mClassicsHeader;
    private boolean isFirstEnter = true;

    public static ListenerBookRecommendFragment newInstance() {
        ListenerBookRecommendFragment listenerBookRecommendFragment = new ListenerBookRecommendFragment();
        return listenerBookRecommendFragment;
    }

    View inflate;
    @Override
    View initView() {
         inflate = View.inflate(getActivity(), R.layout.fg_listenerbookrecommend, null);
        ll_fg_lintenerbookrecommend = (LinearLayout) inflate.findViewById(R.id.ll_fg_lintenerbookrecommend);

        mRefreshLayout = (RefreshLayout) inflate.findViewById(R.id.refreshLayout);

        rv_recommend_hotlists = (RecyclerView) inflate.findViewById(R.id.rv_recommend_hotlists);
        rv_recommend_editorspicks = (RecyclerView) inflate.findViewById(R.id.rv_recommend_editorspicks);
        rv_recommend_hothits = (RecyclerView) inflate.findViewById(R.id.rv_recommend_hothits);
        rv_recommend_hotrecorders = (RecyclerView) inflate.findViewById(R.id.rv_recommend_hotrecorders);
        rv_recommend_newarrivals = (RecyclerView) inflate.findViewById(R.id.rv_recommend_newarrivals);
        rv_recommend_bestauthors = (RecyclerView) inflate.findViewById(R.id.rv_recommend_bestauthors);
        rv_recommend_JYWX = (RecyclerView) inflate.findViewById(R.id.rv_recommend_JYWX);
        rv_recommend_WXSJ = (RecyclerView) inflate.findViewById(R.id.rv_recommend_WXSJ);
        rv_recommend_SDMZ = (RecyclerView) inflate.findViewById(R.id.rv_recommend_SDMZ);

        iv_topics_one = (ImageView) inflate.findViewById(R.id.iv_topics_one);
        iv_topics_two = (ImageView) inflate.findViewById(R.id.iv_topics_two);
        iv_topics_three = (ImageView) inflate.findViewById(R.id.iv_topics_three);
        iv_topics_four = (ImageView) inflate.findViewById(R.id.iv_topics_four);
        iv_topics_five = (ImageView) inflate.findViewById(R.id.iv_topics_five);
        iv_topics_six = (ImageView) inflate.findViewById(R.id.iv_topics_six);
        banner = (Banner) inflate.findViewById(R.id.banner);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();

        mClassicsHeader = (ClassicsHeader) mRefreshLayout.getRefreshHeader();
        mRefreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                //加载 我们来加载更多

                refreshlayout.finishLoadmore();
                Logger.d("加载结束准备");
            }

            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                //刷新

                Logger.d("刷新准备");
                ll_fg_lintenerbookrecommend.setVisibility(View.VISIBLE);

                listenerBookRecommendPresenter.getdata();
            }
        });
        mClassicsHeader.setTimeFormat(new DynamicTimeFormat("最后更新 %s"));
        if (isFirstEnter) {
            isFirstEnter = false;
            //触发自动刷新
            mRefreshLayout.autoRefresh();
        }
        /**
         * 精选书单
         */
        hotBooklists = new ArrayList<>();
        HotBooklistsLayoutManager = new FullyLinearLayoutManager(getActivity());
        rv_recommend_hotlists.setLayoutManager(HotBooklistsLayoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
     //   rv_recommend_hotlists.setHasFixedSize(true);

        recommendHotBooklistsAdapter = new RecommendHotBooklistsAdapter(hotBooklists);
        rv_recommend_hotlists.setAdapter(recommendHotBooklistsAdapter);
        /**
         * 编辑推荐
         */
        editorsPickslists = new ArrayList<>();
        EditorsPicksLayoutManager = new FullyLinearLayoutManager(getActivity());
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
        HothitsLayoutManager = new FullyGridLayoutManager(getActivity(), 3);
        rv_recommend_hothits.setLayoutManager(HothitsLayoutManager);
        rv_recommend_hothits.setAdapter(recommendHothitsAdapter);

        /**
         * 最新上架
         */
        newArrivalslists = new ArrayList<>();
        recommendNewarrivalsAdapter = new RecommendNewarrivalsAdapter(newArrivalslists);
        NewarrivalsLayoutManager = new FullyGridLayoutManager(getActivity(), 3);
        rv_recommend_newarrivals.setLayoutManager(NewarrivalsLayoutManager);
        rv_recommend_newarrivals.setAdapter(recommendNewarrivalsAdapter);

        /**
         * 名家名作
         */

        bestAuthorslists = new ArrayList<>();
        recommendBestAuthorsAdapter = new RecommendBestAuthorsAdapter(bestAuthorslists);
        BestAuthorsLayoutManager = new FullyGridLayoutManager(getActivity(), 3);
        rv_recommend_bestauthors.setLayoutManager(BestAuthorsLayoutManager);
        rv_recommend_bestauthors.setAdapter(recommendBestAuthorsAdapter);

        /**
         * 人气演播
         */
        hotRecorderslists = new ArrayList<>();
        HotRecordersLayoutManager = new FullyLinearLayoutManager(getActivity());
        HotRecordersLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_recommend_hotrecorders.setLayoutManager(HotRecordersLayoutManager);
        recommendHotRecordersAdapter = new RecommendHotRecordersAdapter(hotRecorderslists);
        rv_recommend_hotrecorders.setAdapter(recommendHotRecordersAdapter);

        /**
         * 个性推荐
         */

        // rv_recommend_JYWX.addItemDecoration(new SpacesItemDecoration(spanCount, spacing, includeEdge));
        recommendationsjywxlists = new ArrayList<>();
        recommendRecommendationsJYWXAdapter = new RecommendRecommendationsAdapter(recommendationsjywxlists);
        RecommendationsJYWXLayoutManager = new FullyGridLayoutManager(getActivity(), 4);
        rv_recommend_JYWX.setLayoutManager(RecommendationsJYWXLayoutManager);
        rv_recommend_JYWX.setAdapter(recommendRecommendationsJYWXAdapter);

        //   rv_recommend_WXSJ.addItemDecoration(new SpacesItemDecoration(spanCount, spacing, includeEdge));
        recommendationswxsjlists = new ArrayList<>();
        recommendRecommendationsWXSJAdapter = new RecommendRecommendationsAdapter(recommendationswxsjlists);
        RecommendationsWXSJLayoutManager = new FullyGridLayoutManager(getActivity(), 4);
        rv_recommend_WXSJ.setLayoutManager(RecommendationsWXSJLayoutManager);
        rv_recommend_WXSJ.setAdapter(recommendRecommendationsWXSJAdapter);

        //  rv_recommend_SDMZ.addItemDecoration(new SpacesItemDecoration(spanCount, spacing, includeEdge));
        recommendationssdmzlists = new ArrayList<>();
        recommendRecommendationsSDMZAdapter = new RecommendRecommendationsAdapter(recommendationssdmzlists);
        RecommendationsSDMZLayoutManager = new FullyGridLayoutManager(getActivity(), 4);
        rv_recommend_SDMZ.setLayoutManager(RecommendationsSDMZLayoutManager);
        rv_recommend_SDMZ.setAdapter(recommendRecommendationsSDMZAdapter);
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
        Log.e("setBookRecommendHotBooklists", hotBooklists+"");

    }

    /**
     * 编辑推荐
     *
     * @param editorspicks
     */
    @Override
    public void setBookRecommendEditorspicks(List<RecommendationBean.EditorsPicksBean> editorspicks) {
        mRefreshLayout.finishRefresh();
        editorsPickslists.clear();
        editorsPickslists.addAll(editorspicks);
        recommendEditorsPicksAdapter.notifyDataSetChanged();

        rv_recommend_editorspicks.invalidate();

        Logger.d("傻逼刷新结束==犹如仙女"+editorspicks.size());
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
        Glide.with(this).load(topics.get(2).getCover()).into(iv_topics_three);
        Glide.with(this).load(topics.get(3).getCover()).into(iv_topics_four);
        Glide.with(this).load(topics.get(4).getCover()).into(iv_topics_five);
        Glide.with(this).load(topics.get(5).getCover()).into(iv_topics_six);
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
     *
     * @param bestAuthors
     */
    @Override
    public void setBookRecommendBestAuthors(List<RecommendationBean.BestAuthorsBean> bestAuthors) {
        bestAuthorslists.clear();
        bestAuthorslists.addAll(bestAuthors);
        recommendBestAuthorsAdapter.notifyDataSetChanged();
    }

    /**
     * 人气主播
     *
     * @param hotRecorders
     */
    @Override
    public void setBookRecommendHotRecorders(List<RecommendationBean.HotRecordersBean> hotRecorders) {
        hotRecorderslists.clear();
        hotRecorderslists.addAll(hotRecorders);
        recommendHotRecordersAdapter.notifyDataSetChanged();
    }

    /**
     * 个性推荐
     *
     * @param recommendations
     */
    @Override
    public void setBookRecommendRecommendations(List<RecommendationBean.RecommendationsBean> recommendations) {
        List<RecommendationBean.RecommendationsBean.BooksBeanOne> JYWXbooks = recommendations.get(0).getBooks();
        List<RecommendationBean.RecommendationsBean.BooksBeanOne> WXSJbooks = recommendations.get(1).getBooks();
        List<RecommendationBean.RecommendationsBean.BooksBeanOne> SDMZbooks = recommendations.get(2).getBooks();
        recommendationsjywxlists.clear();
        recommendationsjywxlists.addAll(JYWXbooks);
        recommendRecommendationsJYWXAdapter.notifyDataSetChanged();

        recommendationswxsjlists.clear();
        recommendationswxsjlists.addAll(WXSJbooks);
        recommendRecommendationsWXSJAdapter.notifyDataSetChanged();

        recommendationssdmzlists.clear();
        recommendationssdmzlists.addAll(SDMZbooks);
        recommendRecommendationsSDMZAdapter.notifyDataSetChanged();

    }
}