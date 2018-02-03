package com.mymusic.musicplayer.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;

import com.mymusic.musicplayer.MainData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.fragment.ActivityFragment;
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
    private ListenerBookFragment listenerBookFragment;
    private ActivityFragment activityFragment;

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
        mainData.setMainActivityonclic(this);
    }


    /**
     * 初始化所有基fragment
     */
    private void initFragment() {

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction MfragmentTransaction =fragmentManager.beginTransaction();
        listenerBookFragment = new ListenerBookFragment();
        MfragmentTransaction.add(R.id.ll_container,listenerBookFragment);
        MfragmentTransaction.commit();
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
            case R.id.iv_main_play:
                startActivity(new Intent(this,AudioPlayActivity.class));
                break;
            case R.id.rg_main_listenbook:
                FragmentTransaction MfragmentTransaction1 =fragmentManager.beginTransaction();
                MfragmentTransaction1.replace(R.id.ll_container,listenerBookFragment);
                MfragmentTransaction1.commit();
                break;
            case R.id.rg_main_radiostation:

                FragmentTransaction MfragmentTransaction2 =fragmentManager.beginTransaction();
                MfragmentTransaction2.replace(R.id.ll_container,listenerBookFragment);
                MfragmentTransaction2.commit();
                break;
            case R.id.rg_main_campaign:
                FragmentTransaction MfragmentTransaction4 =fragmentManager.beginTransaction();
                activityFragment = new ActivityFragment();
                MfragmentTransaction4.replace(R.id.ll_container,activityFragment);
                MfragmentTransaction4.commit();

                break;
            case R.id.rg_main_mine:
                FragmentTransaction MfragmentTransaction3 =fragmentManager.beginTransaction();
                MfragmentTransaction3.replace(R.id.ll_container,listenerBookFragment);
                MfragmentTransaction3.commit();
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
