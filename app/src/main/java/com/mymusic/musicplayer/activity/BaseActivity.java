package com.mymusic.musicplayer.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by 小羽 on 2017/3/22.
 */
public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        initdatabinding();
    }

    abstract void initdatabinding();

}
