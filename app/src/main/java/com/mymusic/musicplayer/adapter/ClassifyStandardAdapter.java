package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.ClassifyBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public class ClassifyStandardAdapter extends BaseAdapter<ClassifyBean.StandardTypesBean.LabelsBeanX, ClassifyStandardAdapter.ViewHolder> {
    public ClassifyStandardAdapter(List<ClassifyBean.StandardTypesBean.LabelsBeanX> data) {
        super(data);
    }

    @Override
    Class<ClassifyStandardAdapter.ViewHolder> vhClass() {
        return ViewHolder.class;
    }

    @Override
    int initLayoutId() {
        return R.layout.item_classify;
    }

    @Override
    public void onBindViewHolder(ClassifyStandardAdapter.ViewHolder holder, int position) {
        holder.tv_item_classify.setText(data.get(position).getName());

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_item_classify;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_item_classify = (TextView) itemView.findViewById(R.id.tv_item_classify);

        }
    }
}
