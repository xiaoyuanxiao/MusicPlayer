package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
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
    public void setOnclick() {

    }

    @Override
    void initdatabinding() {
        splashActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);

    }

    @Override
    public void onClick(View view) {

    }
}
