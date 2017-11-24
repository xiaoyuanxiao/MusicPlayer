package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendHotRecordersAdapter extends RecyclerView.Adapter<RecommendHotRecordersAdapter.ViewHolder> {
    List<RecommendationBean.HotRecordersBean> list;

    public RecommendHotRecordersAdapter(List<RecommendationBean.HotRecordersBean> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(parent.getContext(), R.layout.item_recommend_hotrecords, null);

        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_title.setText(list.get(position).getRecorder().getName());
        Glide.with(holder.tv_title.getContext()).load(list.get(position).getRecorder().getHead()).into(holder.iv_cover);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_cover;
        TextView tv_title;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_cover = (ImageView) itemView.findViewById(R.id.iv_cover);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            DisplayMetrics displayMetrics = tv_title.getContext().getResources().getDisplayMetrics();
            LinearLayout.LayoutParams lau = new LinearLayout.LayoutParams((displayMetrics.widthPixels) / 4 - itemView.getPaddingLeft() * 2, (displayMetrics.widthPixels) / 4 - itemView.getPaddingLeft() * 2);
            iv_cover.setLayoutParams(lau);


        }
    }
}
