package com.mymusic.musicplayer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendRecommendationsOneAdapter extends RecyclerView.Adapter<RecommendRecommendationsOneAdapter.ViewHolder> {
    List<RecommendationBean.RecommendationsBean.BooksBeanOne> list;

    public RecommendRecommendationsOneAdapter(List<RecommendationBean.RecommendationsBean.BooksBeanOne> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(parent.getContext(), R.layout.item_recommend_image, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        WindowManager wm = (WindowManager) holder.iv_cover.getContext().getSystemService(Context.WINDOW_SERVICE);

        int width = wm.getDefaultDisplay().getWidth();
        holder.iv_cover.setLayoutParams(new LinearLayout.LayoutParams((width - 55) / 4, (width - 55) / 4));
        Glide.with(holder.iv_cover.getContext()).load(list.get(position).getBook().getCover())
                .into(holder.iv_cover);
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
        ImageView iv_cover;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_cover = (ImageView) itemView.findViewById(R.id.iv_cover);
        }
    }
}
