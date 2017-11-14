package com.mymusic.musicplayer.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by 小羽 on 2017/3/22.
 */
public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initdatabinding();
        initData();
    }

    public void initData() {
        setOnclick();
    }

    public abstract void setOnclick();

    abstract void initdatabinding();

}
