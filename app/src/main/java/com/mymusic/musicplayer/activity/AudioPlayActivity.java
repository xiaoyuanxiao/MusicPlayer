package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.view.View;

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

public class AudioPlayActivity extends BaseActivity implements IAudioPlayView, View.OnClickListener {
    AudioPlayBinding audioPlayBinding;
    private AudioPlayPresenter audioPlayPresenter = new AudioPlayPresenter(this);
    private boolean isChecked = true;

    @Override
    int initview() {
        return R.layout.activity_audioplay;
    }

    @Override
    void initdatabinding() {
        audioPlayBinding = getBind();
        audioPlayBinding.setAudioPlayActivityonclick(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_audioplay_play:
                if (isChecked) {
                    isChecked = false;
                    audioPlayBinding.ivAudioplayPlay.setImageResource(R.mipmap.f_icon03_play);
                } else {
                    isChecked = true;
                    audioPlayBinding.ivAudioplayPlay.setImageResource(R.mipmap.f_icon03_stop);
                }

                break;
        }

    }
}
