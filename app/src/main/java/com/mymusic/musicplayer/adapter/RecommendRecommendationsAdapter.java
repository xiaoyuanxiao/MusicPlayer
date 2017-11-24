package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.utils.ScreenUtils;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendRecommendationsAdapter extends RecyclerView.Adapter<RecommendRecommendationsAdapter.ViewHolder> {
    List<RecommendationBean.RecommendationsBean.BooksBeanOne> list;

    public RecommendRecommendationsAdapter(List<RecommendationBean.RecommendationsBean.BooksBeanOne> list) {
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
        Logger.d("==" + list.get(position).getBook().getCover());
        Glide.with(holder.iv_cover.getContext())
                .load(list.get(position).getBook().getCover())
                .placeholder(R.mipmap.h_icon01_active)
                .error(R.mipmap.h_icon01_book)
                .centerCrop()
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
            int screenWidth = ScreenUtils.getScreenWidth(iv_cover.getContext());
            LinearLayout.LayoutParams lau = new LinearLayout.LayoutParams(screenWidth / 4 - itemView.getPaddingLeft() * 2 - 12, (screenWidth / 3) - itemView.getPaddingLeft() * 2 - 12);
            iv_cover.setLayoutParams(lau);
        }
    }
}
