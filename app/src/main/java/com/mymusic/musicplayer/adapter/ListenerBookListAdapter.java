package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.BookListBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public class ListenerBookListAdapter extends BaseAdapter<BookListBean, ListenerBookListAdapter.ViewHolder> {


    public ListenerBookListAdapter(List<BookListBean> data) {
        super(data);
    }

    @Override
    Class<ListenerBookListAdapter.ViewHolder> vhClass() {
        return ViewHolder.class;
    }

    @Override
    int initLayoutId() {
        return R.layout.item_recommend_listview;
    }

    @Override
    public void onBindViewHolder(ListenerBookListAdapter.ViewHolder holder, int position) {
        BookListBean bookListBean = data.get(position);
        holder.tv_hot_booklists_title.setText(bookListBean.getTitle());
        holder.tv_hot_booklists_description.setText(bookListBean.getDescription());
        Glide.with(holder.tv_hot_booklists_title.getContext()).load(bookListBean.getCover()).into(holder.iv_hot_booklists);
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
