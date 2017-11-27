package com.mymusic.musicplayer.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import static com.mymusic.musicplayer.R.id.refreshLayout_fg_classify;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class ClassifyFragment extends BaseFragment {

    private RefreshLayout mRefreshLayout;
    private RecyclerView recyclerView;

    public static ClassifyFragment newInstance() {
        ClassifyFragment classifyFragment = new ClassifyFragment();
        return classifyFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_classify, null);
        mRefreshLayout = (RefreshLayout) inflate.findViewById(refreshLayout_fg_classify);
        recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView);
        return inflate;
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }
}
