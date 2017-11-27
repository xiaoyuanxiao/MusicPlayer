package com.mymusic.musicplayer.fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.mymusic.musicplayer.R;

import java.util.ArrayList;

/**
 * Created by xiaoyu on 2017/11/15.
 */

public class ListenerBookFragment extends BaseFragment {
    private RadioButton mRb_fg_listenerbook_recommend;
    private RadioButton mRb_fg_listenerbook_classify;
    private RadioButton mRb_fg_listenerbook_booklist;
    private RadioButton mRb_fg_listenerbook_list;
    private ArrayList<Fragment> fragments;
    private FragmentManager fragmentManager;

    public static ListenerBookFragment newInstance() {
        ListenerBookFragment listenerBookFragment = new ListenerBookFragment();
        return listenerBookFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbook, null);
        mRb_fg_listenerbook_recommend = (RadioButton) inflate.findViewById(R.id.rb_fg_listenerbook_recommend);
        mRb_fg_listenerbook_classify = (RadioButton) inflate.findViewById(R.id.rb_fg_listenerbook_classify);
        mRb_fg_listenerbook_booklist = (RadioButton) inflate.findViewById(R.id.rb_fg_listenerbook_booklist);
        mRb_fg_listenerbook_list = (RadioButton) inflate.findViewById(R.id.rb_fg_listenerbook_list);
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
        fragments.add(ClassifyFragment.newInstance());
        fragments.add(ListenerBookListsFragment.newInstance());
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
        mRb_fg_listenerbook_recommend.setOnClickListener(this);
        mRb_fg_listenerbook_classify.setOnClickListener(this);
        mRb_fg_listenerbook_booklist.setOnClickListener(this);
        mRb_fg_listenerbook_list.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_fg_listenerbook_recommend:
                showFragment(fragments.get(0));
                break;
            case R.id.rb_fg_listenerbook_classify:
                showFragment(fragments.get(1));
                break;
            case R.id.rb_fg_listenerbook_booklist:
                showFragment(fragments.get(2));
                break;
            case R.id.rb_fg_listenerbook_list:
                showFragment(fragments.get(3));
                break;
        }
    }

}