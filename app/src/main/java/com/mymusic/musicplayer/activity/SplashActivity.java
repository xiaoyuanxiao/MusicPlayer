package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.SplashActivityBinding;

/**
 * Created by xiaoyu on 2017/11/21.
 */

public class SplashActivity extends BaseActivity {


    private SplashActivityBinding splashActivityBinding;

    @Override
    int initview() {
        return R.layout.activity_splash;
    }

    @Override
    void initdatabinding() {
        splashActivityBinding = getBind();
    }

    @Override
    public int getTitleview() {
        return View.GONE;
    }

    public void initData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }
}
