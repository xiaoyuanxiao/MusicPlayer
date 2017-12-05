package com.mymusic.musicplayer.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mymusic.musicplayer.R;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public class RankSynopsisFragment extends BaseFragment {
    TextView tv_ranksynopsis;

    public static RankSynopsisFragment newInstance() {
        RankSynopsisFragment rankSynopsisFragment = new RankSynopsisFragment();
        return rankSynopsisFragment;
    }
    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_ranksynopsis, null);
        tv_ranksynopsis = (TextView) inflate.findViewById(R.id.tv_ranksynopsis);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        Bundle bundle = getArguments();//从activity传过来的Bundle
        if (bundle != null) {
            String synopsis = bundle.getString("Synopsis");
            tv_ranksynopsis.setText(synopsis);
        }
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }

}
