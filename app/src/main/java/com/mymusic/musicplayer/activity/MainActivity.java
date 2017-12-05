package com.mymusic.musicplayer.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.mymusic.musicplayer.MainData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.fragment.ListenerBookFragment;
import com.mymusic.musicplayer.utils.FragmentUtils;
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
    public int getTitleview() {
        return View.GONE;
    }

    void initdatabinding() {
        mainData = getBind();
        //资源集合，mipmap和selector都可以
        int[] drawables = {R.drawable.main_selector_book, R.drawable.main_selector_radiostation,
                R.drawable.main_selector_campaign, R.drawable.main_selector_mine};
        RadioButtonImgUtil.setRadioButtonImg(this, drawables, 35, mainData.rgMainListenbook, mainData.rgMainRadiostation, mainData.rgMainCampaign, mainData.rgMainMine);

    }

    @Override
    void initData() {

        setOnclick();
        initFragment();
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
        FragmentUtils.showFragment(fragments.get(0), R.id.ll_container, fragmentManager, fragments);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rg_main_listenbook:
                FragmentUtils.showFragment(fragments.get(0), R.id.ll_container, fragmentManager, fragments);
                break;
            case R.id.rg_main_radiostation:
                FragmentUtils.showFragment(fragments.get(1), R.id.ll_container, fragmentManager, fragments);
                break;
            case R.id.rg_main_campaign:
                FragmentUtils.showFragment(fragments.get(2), R.id.ll_container, fragmentManager, fragments);
                break;
            case R.id.rg_main_mine:
                FragmentUtils.showFragment(fragments.get(3), R.id.ll_container, fragmentManager, fragments);
                break;
        }

    }


}
