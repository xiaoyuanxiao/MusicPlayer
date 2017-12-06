package com.mymusic.musicplayer.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.mymusic.musicplayer.BR;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.RankCommentData;
import com.mymusic.musicplayer.adapter.BaseRecyleAdapter;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoyu on 2017/12/6.
 */

public class RankCommentFragment extends MyBaseFragment {
    RankCommentData rankCommentData;
    private LinearLayoutManager linearLayoutManager;
    private BaseRecyleAdapter baseRecyleAdapte;


    public static RankCommentFragment newInstance() {
        RankCommentFragment rankCommentFragment = new RankCommentFragment();
        return rankCommentFragment;
    }

    @Override
    int initview() {
        return R.layout.fg_rankcomment;
    }

    @Override
    protected void initData() {
        super.initData();
        rankCommentData = getBind();
        getActivityData();

        linearLayoutManager = new LinearLayoutManager(getActivity());
        rankCommentData.rvRankcomment.setLayoutManager(linearLayoutManager);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(R.layout.item_fg_rankcomment, BR.latestBean);
        baseRecyleAdapte = new BaseRecyleAdapter(comment.getLatest(), map);
        rankCommentData.rvRankcomment.setAdapter(baseRecyleAdapte);
    }

    BookRankDetailsBean.CommentsBean comment;

    private void getActivityData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            comment = (BookRankDetailsBean.CommentsBean) arguments.getSerializable("comment");
            rankCommentData.tvRankcomment.setText("最新评论(" + comment.getLatest().size() + ")");
        }
    }
}
