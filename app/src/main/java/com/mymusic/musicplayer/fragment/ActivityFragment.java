package com.mymusic.musicplayer.fragment;



import android.support.v7.widget.LinearLayoutManager;

import com.mymusic.musicplayer.BR;
import com.mymusic.musicplayer.FgActivityBinding;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.ActivityAdapter;
import com.mymusic.musicplayer.adapter.BaseRecyleAdapter;
import com.mymusic.musicplayer.adapter.CatalogAdapter;
import com.mymusic.musicplayer.bean.ActivityBean;
import com.mymusic.musicplayer.okhttp.Iview.IActivityListView;
import com.mymusic.musicplayer.okhttp.Presenter.ActivityPersenter;
import com.mymusic.musicplayer.view.MyLinearLayoutManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cc on 2018/1/30.
 */

public class ActivityFragment extends MyBaseFragment implements IActivityListView{
    FgActivityBinding bind;
    private LinearLayoutManager linearLayoutManager;
    private ActivityAdapter activityAdapter;
    private ActivityPersenter activityPersenter = new ActivityPersenter(this);
    private List<ActivityBean> activityBeans;
    public static ActivityFragment newInstance() {
        ActivityFragment activityFragment = new ActivityFragment();
        return activityFragment;
    }

    @Override
    int initview() {
        return R.layout.fg_activity;
    }

    @Override
    protected void initData() {
        super.initData();
        bind = getBind();
        linearLayoutManager = new LinearLayoutManager(getActivity());
        bind.rvFgActivity.setLayoutManager(linearLayoutManager);
        activityPersenter.getdata();

    }


    @Override
    public void setActivityList(List<ActivityBean> activityList) {
        activityBeans = activityList;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(R.layout.item_fg_activity, BR.activityBean);
       activityAdapter = new ActivityAdapter(activityBeans, map);
        bind.rvFgActivity.setAdapter(activityAdapter);

    }
}
