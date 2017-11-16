package com.mymusic.musicplayer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendationAdapter extends BaseListAdapter<RecommendationBean.CarouselsBean> {

    public RecommendationAdapter(Context context, List<RecommendationBean.CarouselsBean> data) {
        super(context, data);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
