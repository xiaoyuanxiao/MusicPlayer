package com.mymusic.musicplayer.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.mymusic.musicplayer.BaseInfoData;
import com.mymusic.musicplayer.R;

/**
 * Created by 小羽 on 2017/3/22.
 */
public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBaseTitle();
    }

    ViewDataBinding inflate;
    int titleview = View.VISIBLE;

    public int getTitleview() {
        return titleview;
    }

    private void initBaseTitle() {
        BaseInfoData baseInfoData = DataBindingUtil.setContentView(this, R.layout.titlebar);
        baseInfoData.rlTitlebar.setVisibility(getTitleview());
        baseInfoData.setBaseInfoActivityonclic(this);
        LayoutInflater from = LayoutInflater.from(this);
        inflate = DataBindingUtil.inflate(from, initview(), null, false);
        baseInfoData.contentParntView.addView(inflate.getRoot());
        initdata();
    }

    public <T extends ViewDataBinding> T getBind() {
        return (T) inflate;
    }

    abstract int initview();

    abstract void initdata();

    @Override
    public void onClick(View view) {
        finish();
    }
}
