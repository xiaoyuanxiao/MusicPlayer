package com.mymusic.musicplayer.adapter;

import android.content.Intent;
import android.view.View;

import com.mymusic.musicplayer.BR;
import com.mymusic.musicplayer.activity.BookRankDetailsActivity;
import com.mymusic.musicplayer.bean.RankingBean;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyu on 2017/11/30.
 */

public class ListenerBookRankAdapter extends BaseRecyleAdapter implements BaseRecyleAdapter.OnRecycleitemOnClic {
    private List<RankingBean.SalesBean.BooksBeanDes> booksBeanDes;

    public ListenerBookRankAdapter(List<?> data, Map<Integer, Integer> hashMap) {
        super(data, hashMap);
        this.booksBeanDes = (List<RankingBean.SalesBean.BooksBeanDes>) data;
        setOnRecycleitemOnClic(this);
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);
        int i = position + 1;
        String text = i >= 10 ? String.valueOf(i) : String.valueOf("0" + i);
        holder.dataBinding.setVariable(BR.itemtestnum, text);
    }

    @Override
    public void onItemClic(View view, int position) {
        int id = booksBeanDes.get(position).getBook().getId();
        Intent intent = new Intent();
        intent.putExtra("ID", id);
        intent.setClass(view.getContext(), BookRankDetailsActivity.class);
        view.getContext().startActivity(intent);
    }
}
