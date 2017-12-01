package com.mymusic.musicplayer.activity;

import android.view.View;

import com.mymusic.musicplayer.R;

/**
 * Created by xiaoyu on 2017/11/30.
 */

public abstract class BaseInfoActivity extends BaseActivity {


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_titlebar_left:
                finish();
                break;
        }

    }
}
