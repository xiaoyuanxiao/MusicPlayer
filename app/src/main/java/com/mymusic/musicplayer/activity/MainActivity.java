package com.mymusic.musicplayer.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;

import com.mymusic.musicplayer.MainData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.fragment.ListenerBookFragment;
import com.mymusic.musicplayer.service.MusicService;
import com.mymusic.musicplayer.utils.FragmentUtils;
import com.mymusic.musicplayer.utils.RadioButtonImgUtil;

import java.util.ArrayList;

/**
 * Created by xiaoyu on 2017/11/14.
 */

public class MainActivity extends BaseActivity implements View.OnClickListener {

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

    //  获取并设置返回键的点击事件
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            showDialog();
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 退出应用
     */
    private void showDialog() {
        new AlertDialog.Builder(this).setTitle("确认退出吗？")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this, MusicService.class);
                        stopService(intent);
                        finish();

                    }
                })
                .setNegativeButton("返回", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }


}
