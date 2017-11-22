package com.mymusic.musicplayer.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/22.
 */

public abstract class BaseListAdapter<T> extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    List<T> data;
    int layId;

    public BaseListAdapter(Context context, List<T> data, int layId) {
        this.context = context;
        this.data = data;
        this.layId = layId;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewHolder viewHolder = ViewHolder.get(context, parent, layId);
        return viewHolder;
    }

    public abstract void convert(ViewHolder holder, T t);

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //  holder.updatePosition(position);
        convert(holder, data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
