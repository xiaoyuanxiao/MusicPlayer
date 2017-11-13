package com.mymusic.musicplayer.activity;


import android.databinding.DataBindingUtil;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.Testdata;

public class MainActivity extends BaseActivity {

    @Override
    void initdatabinding() {

        Testdata viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewDataBinding.rgMainMine.setText("hahahah");
    }

    @Override
    public void onClick(View view) {

    }
}
