package com.mymusic.musicplayer.fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.mymusic.musicplayer.R;

import java.util.ArrayList;

/**
 * Created by xiaoyu on 2017/11/15.
 */

public class ListenerBookFragment extends BaseFragment {
    private TextView mTv_fg_listenerbook_recommend;
    private TextView mTv_fg_listenerbook_classify;
    private TextView mTv_fg_listenerbook_booklist;
    private TextView mTv_fg_listenerbook_list;
    private ArrayList<Fragment> fragments;
    private FragmentManager fragmentManager;

    public static ListenerBookRecommendFragment newInstance() {
        ListenerBookRecommendFragment listenerBookRecommendFragment = new ListenerBookRecommendFragment();
        return listenerBookRecommendFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbook, null);
        mTv_fg_listenerbook_recommend = (TextView) inflate.findViewById(R.id.tv_fg_listenerbook_recommend);
        mTv_fg_listenerbook_classify = (TextView) inflate.findViewById(R.id.tv_fg_listenerbook_classify);
        mTv_fg_listenerbook_booklist = (TextView) inflate.findViewById(R.id.tv_fg_listenerbook_booklist);
        mTv_fg_listenerbook_list = (TextView) inflate.findViewById(R.id.tv_fg_listenerbook_list);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        fragmentManager = getFragmentManager();
        initFragment();
    }

    /**
     * 初始化所有基fragment
     */
    private void initFragment() {
        fragments = new ArrayList<Fragment>();
        fragments.add(ListenerBookRecommendFragment.newInstance());
        fragments.add(ListenerBookRecommendFragment.newInstance());
        fragments.add(ListenerBookRecommendFragment.newInstance());
        fragments.add(ListenerBookRecommendFragment.newInstance());
        showFragment(fragments.get(0));

    }

    /**
     * 显示fragment
     *
     * @param fragment 要显示的fragment
     */
    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragment(transaction);
        if (fragment.isAdded()) {
            transaction.show(fragment);
        } else {
            transaction.add(R.id.ll_container, fragment, fragment.getClass().getName());
        }
        transaction.commit();
    }

    /**
     * 隐藏其他fragment
     *
     * @param transaction 控制器
     */
    private void hideFragment(FragmentTransaction transaction) {
        for (int i = 0; fragments.size() > i; i++) {
            if (fragments.get(i).isVisible()) {
                transaction.hide(fragments.get(i));
            }
        }
    }

    @Override
    protected void setOnclick() {
        mTv_fg_listenerbook_recommend.setOnClickListener(this);
        mTv_fg_listenerbook_classify.setOnClickListener(this);
        mTv_fg_listenerbook_booklist.setOnClickListener(this);
        mTv_fg_listenerbook_list.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_fg_listenerbook_recommend:

                break;
            case R.id.tv_fg_listenerbook_classify:
                break;
            case R.id.tv_fg_listenerbook_booklist:
                break;
            case R.id.tv_fg_listenerbook_list:
                break;
        }

    }
}