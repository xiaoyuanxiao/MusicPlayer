package com.mymusic.musicplayer.activity;

import android.content.Intent;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.AudioPlayBinding;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.AudioUrlBean;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.okhttp.Iview.IAudioPlayView;
import com.mymusic.musicplayer.okhttp.Presenter.AudioPlayPresenter;

/**
 * Created by xiaoyu on 2017/12/8.
 */

public class AudioPlayActivity extends BaseActivity implements IAudioPlayView {
    AudioPlayBinding audioPlayBinding;
    private AudioPlayPresenter audioPlayPresenter = new AudioPlayPresenter(this);

    @Override
    int initview() {
        return R.layout.activity_audioplay;
    }

    @Override
    void initdatabinding() {
        audioPlayBinding = getBind();

    }

    @Override
    void initData() {
        Intent intent = getIntent();
        String thumbnail = intent.getStringExtra("thumbnail");
        BookRankDetailsBean.SectionsBean sectionsBean = intent.getParcelableExtra("sectionsBean");
        audioPlayBinding.tvAudioplayTitle.setText(sectionsBean.getSection().getTitle());
        audioPlayPresenter.getdata(sectionsBean.getSection().getId(), "section");
        Glide.with(this).load(thumbnail).into(audioPlayBinding.ivAudioplayCover);
    }

    @Override
    public void setdata(AudioUrlBean audioUrlBean) {
        audioPlayBinding.setAudioUrlBean(audioUrlBean);
    }
}
