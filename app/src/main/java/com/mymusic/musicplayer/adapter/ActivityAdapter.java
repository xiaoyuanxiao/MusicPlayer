package com.mymusic.musicplayer.adapter;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mymusic.musicplayer.ItemFgActivityData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.activity.CampaignDetailActivity;
import com.mymusic.musicplayer.activity.SalesRankActivity;
import com.mymusic.musicplayer.bean.ActivityBean;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;

import java.util.List;
import java.util.Map;

/**
 * Created by cc on 2018/1/30.
 */

public class ActivityAdapter extends BaseRecyleAdapter implements BaseRecyleAdapter.OnRecycleitemOnClic{
    private List<ActivityBean> activityBeans;
    private Context context;
    ItemFgActivityData itemFgActivityData;
    public ActivityAdapter(List<?> data, Map<Integer, Integer> hashMap) {
        super(data, hashMap);
        activityBeans = (List<ActivityBean>) data;
        setOnRecycleitemOnClic(this);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        itemFgActivityData = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_fg_activity, parent, false);
        return new ViewHolder(itemFgActivityData);
    }

    @Override
    public void onItemClic(View view, int position) {
        Intent intent = new Intent(context, CampaignDetailActivity.class);
        ActivityBean activityBean = activityBeans.get(position);
        intent.putExtra("activityBean", activityBean);
        context.startActivity(intent);
    }
}
