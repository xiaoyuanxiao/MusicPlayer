package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
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

public class RecommendHotBooklistsAdapter extends RecyclerView.Adapter<RecommendHotBooklistsAdapter.ViewHolder> {
    List<RecommendationBean.HotBooklistsBean> list;

    public RecommendHotBooklistsAdapter(List<RecommendationBean.HotBooklistsBean> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(parent.getContext(), R.layout.item_recommend_listview, null);
        RecommendHotBooklistsAdapter.ViewHolder viewHolder = new RecommendHotBooklistsAdapter.ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecommendHotBooklistsAdapter.ViewHolder holder, int position) {
        RecommendationBean.HotBooklistsBean hotBooklistsBean = list.get(position);

        holder.tv_hot_booklists_title.setText(hotBooklistsBean.getTitle());
        holder.tv_hot_booklists_description.setText(hotBooklistsBean.getDescription());
        Glide.with(holder.tv_hot_booklists_title.getContext()).load(hotBooklistsBean.getCover()).into(holder.iv_hot_booklists);
    }

    @Override
    public int getItemCount() {
        if (list == null)
            return 0;
        if (list.size() > 4)
            return 4;
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_hot_booklists;
        TextView tv_hot_booklists_title;
        TextView tv_hot_booklists_description;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_hot_booklists = (ImageView) itemView.findViewById(R.id.iv_hot_booklists);
            tv_hot_booklists_title = (TextView) itemView.findViewById(R.id.tv_hot_booklists_title);
            tv_hot_booklists_description = (TextView) itemView.findViewById(R.id.tv_hot_booklists_description);
        }
    }
}
