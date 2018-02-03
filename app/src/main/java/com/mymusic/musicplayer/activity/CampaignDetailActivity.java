package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.databinding.ViewDataBinding;
import android.os.Parcelable;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.CompaignDetailData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.ActivityBean;

/**
 * Created by cc on 2018/1/31.
 */

public class CampaignDetailActivity extends BaseActivity {
    CompaignDetailData bind;
    ActivityBean activityBean;
    @Override
    int initview() {
        return R.layout.activity_compaigndetail;
    }

    @Override
    void initdatabinding() {
        bind = getBind();
    }


    @Override
    void initData() {
        setDataTitle("活动");
        setTitleRightimg(R.mipmap.f_close);
        Intent intent = getIntent();
        activityBean = intent.getParcelableExtra("activityBean");

        bind.tvCompaignTitle.setText(activityBean.getEvent().getTitle());
        bind.tvCompaignTime.setText(activityBean.getEvent().getEvent_time());
        Glide.with(this).load(activityBean.getEvent().getCover()).into(bind.ivCompaignCover);
        bind.tvCompaignContent.setText(activityBean.getEvent().getDetail());
        bind.tvCompaignComment.setText(activityBean.getStat().getCount_of_comment()+"");
        bind.tvCompaignZan.setText(activityBean.getStat().getCount_of_like()+"");
    }
}
