package com.mymusic.musicplayer.fragment;

import android.view.View;

import com.mymusic.musicplayer.R;

/**
 * Created by xiaoyu on 2017/11/23.
 */

public class ListenerBookListsFragment extends BaseFragment {
    public static ListenerBookListsFragment newInstance() {
        ListenerBookListsFragment listenerBookListsFragment = new ListenerBookListsFragment();
        return listenerBookListsFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbooklists, null);
        return inflate;
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }
}
