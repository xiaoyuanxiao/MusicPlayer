package com.mymusic.musicplayer.adapter;

import com.mymusic.musicplayer.BR;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/30.
 */

public class ListenerBookRankAdapter extends BaseRecyleAdapter {
    public ListenerBookRankAdapter(List<?> data, int layout, int varid) {
        super(data, layout, varid);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        int i = position + 1;
        String text = i >= 10 ? String.valueOf(i) : String.valueOf("0" + i);
        holder.dataBinding.setVariable(BR.itemtestnum, text);
    }
}
