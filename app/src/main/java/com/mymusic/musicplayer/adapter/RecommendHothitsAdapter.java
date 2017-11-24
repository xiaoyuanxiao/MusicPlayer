package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.utils.ScreenUtils;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendHothitsAdapter extends RecyclerView.Adapter<RecommendHothitsAdapter.ViewHolder> {
    List<RecommendationBean.HotHitsBean> list;

    public RecommendHothitsAdapter(List<RecommendationBean.HotHitsBean> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(parent.getContext(), R.layout.item_recommend_listview1, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_title.setText(list.get(position).getBook().getTitle());
        Glide.with(holder.tv_title.getContext()).load(list.get(position).getBook().getCover()).into(holder.iv_cover);
    }

    @Override
    public int getItemCount() {
        if (list == null)
            return 0;
        if (list.size() > 6)
            return 6;
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_cover;
        TextView tv_title;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_cover = (ImageView) itemView.findViewById(R.id.iv_cover);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            int screenWidth = ScreenUtils.getScreenWidth(tv_title.getContext());
            LinearLayout.LayoutParams lau = new LinearLayout.LayoutParams(screenWidth / 3 - itemView.getPaddingLeft() * 2 - 10, (screenWidth / 3) - itemView.getPaddingLeft() * 2 - 10);
            iv_cover.setLayoutParams(lau);
        }
    }
}
