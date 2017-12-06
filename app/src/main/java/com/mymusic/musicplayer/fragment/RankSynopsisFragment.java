package com.mymusic.musicplayer.fragment;

import android.os.Bundle;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.RankSynopsisData;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public class RankSynopsisFragment extends MybaseFragment {
    RankSynopsisData rankSynopsisData;
    public static RankSynopsisFragment newInstance() {
        RankSynopsisFragment rankSynopsisFragment = new RankSynopsisFragment();
        return rankSynopsisFragment;
    }


    @Override
    int initview() {
        return R.layout.fg_ranksynopsis;
    }

    @Override
    protected void initData() {
        super.initData();
        rankSynopsisData = getBind();
        Bundle bundle = getArguments();//从activity传过来的Bundle
        if (bundle != null) {
            String synopsis = bundle.getString("Synopsis");
            rankSynopsisData.tvRanksynopsis.setText(synopsis);
        }
    }


}
