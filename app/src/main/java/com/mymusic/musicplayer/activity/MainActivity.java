package com.mymusic.musicplayer.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.mymusic.musicplayer.MainData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.fragment.ListenerBookFragment;
import com.mymusic.musicplayer.utils.RadioButtonImgUtil;

import java.util.ArrayList;

/**
 * Created by xiaoyu on 2017/11/14.
 */

public class MainActivity extends BaseActivity {

    private MainData mainData;
    private ArrayList<Fragment> fragments;
    private FragmentManager fragmentManager;

    @Override
    int initview() {
        return R.layout.activity_main;
    }

    @Override
    void initdata() {
        mainData = getBind();
        initdatabinding();
        setOnclick();
        initFragment();
    }

    @Override
    public int getTitleview() {
        return View.GONE;
    }

    void initdatabinding() {
        //资源集合，mipmap和selector都可以
        int[] drawables = {R.drawable.main_selector_book, R.drawable.main_selector_radiostation,
                R.drawable.main_selector_campaign, R.drawable.main_selector_mine};
        RadioButtonImgUtil.setRadioButtonImg(this, drawables, 35, mainData.rgMainListenbook, mainData.rgMainRadiostation, mainData.rgMainCampaign, mainData.rgMainMine);

    }

    public void setOnclick() {
        mainData.rgMainListenbook.setOnClickListener(this);
        mainData.rgMainRadiostation.setOnClickListener(this);
        mainData.rgMainCampaign.setOnClickListener(this);
        mainData.rgMainMine.setOnClickListener(this);
    }


    /**
     * 初始化所有基fragment
     */
    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        fragments = new ArrayList<Fragment>();
        fragments.add(ListenerBookFragment.newInstance());
        fragments.add(ListenerBookFragment.newInstance());
        fragments.add(ListenerBookFragment.newInstance());
        fragments.add(ListenerBookFragment.newInstance());
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
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rg_main_listenbook:
                showFragment(fragments.get(0));
                break;
            case R.id.rg_main_radiostation:
                showFragment(fragments.get(1));
                break;
            case R.id.rg_main_campaign:
                showFragment(fragments.get(2));
                break;
            case R.id.rg_main_mine:
                showFragment(fragments.get(3));
                break;
        }

    }


}
