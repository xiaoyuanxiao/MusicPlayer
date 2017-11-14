package com.mymusic.musicplayer.activity;

import android.databinding.DataBindingUtil;
import android.view.View;

import com.mymusic.musicplayer.MainData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.utils.RadioButtonImgUtil;

/**
 * Created by xiaoyu on 2017/11/14.
 */

public class MainActivity extends BaseActivity {


    private MainData mainData;

    @Override
    void initdatabinding() {
        mainData = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //资源集合，mipmap和selector都可以
        int[] drawables = {R.drawable.main_selector_book, R.drawable.main_selector_radiostation,
                R.drawable.main_selector_campaign, R.drawable.main_selector_mine};
        RadioButtonImgUtil.setRadioButtonImg(this, drawables, 35, mainData.rgMainListenbook, mainData.rgMainRadiostation, mainData.rgMainCampaign, mainData.rgMainMine);

    }

    @Override
    public void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }


}
