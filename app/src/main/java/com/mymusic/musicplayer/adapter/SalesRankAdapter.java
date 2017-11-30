package com.mymusic.musicplayer.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.SalesRankData;
import com.mymusic.musicplayer.bean.RankingBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public class SalesRankAdapter extends BaseDatabindingAdapter<RankingBean.SalesBean.BooksBeanDes, SalesRankAdapter.ViewHolder> {
    public SalesRankAdapter(List<RankingBean.SalesBean.BooksBeanDes> data) {
        super(data);
    }

    @Override
    Class<SalesRankAdapter.ViewHolder> vhClass() {
        return ViewHolder.class;
    }

    @Override
    int initLayoutId() {
        return R.layout.item_salesrank;
    }

    @Override
    public void onBindViewHolder(SalesRankAdapter.ViewHolder holder, int position) {
        //这里就是绑定数据的地方
        RankingBean.SalesBean.BooksBeanDes booksBeanX = data.get(position);
        holder.databinding.setSalesBean(booksBeanX);
        if (position > 8) {
            holder.databinding.tvItemSalesrankNumber.setText(String.valueOf(position + 1));
        } else {
            holder.databinding.tvItemSalesrankNumber.setText("0" + (position + 1));
        }

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public SalesRankData databinding;

        public ViewHolder(ViewDataBinding itemView) {
            super(itemView.getRoot());
            this.databinding = (SalesRankData) itemView;//把ViewDataBinding强转成我们定义的类
        }
    }
}
