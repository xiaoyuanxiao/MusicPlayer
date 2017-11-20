package com.mymusic.musicplayer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendHotBooklistsAdapter extends BaseListAdapter<RecommendationBean.HotBooklistsBean> {

    public RecommendHotBooklistsAdapter(Context context, List<RecommendationBean.HotBooklistsBean> data) {
        super(context, data);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RecommendationBean.HotBooklistsBean hotBooklistsBean = data.get(i);
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.item_recommend_listview, null);
            holder.iv_hot_booklists = (ImageView) view.findViewById(R.id.iv_hot_booklists);
            holder.tv_hot_booklists_title = (TextView) view.findViewById(R.id.tv_hot_booklists_title);
            holder.tv_hot_booklists_description = (TextView) view.findViewById(R.id.tv_hot_booklists_description);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(hotBooklistsBean.getCover()).into(holder.iv_hot_booklists);
        holder.tv_hot_booklists_title.setText(hotBooklistsBean.getTitle());
        holder.tv_hot_booklists_description.setText(hotBooklistsBean.getDescription());
        return view;
    }

    class ViewHolder {
        ImageView iv_hot_booklists;
        TextView tv_hot_booklists_title;
        TextView tv_hot_booklists_description;
    }
}
