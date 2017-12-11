package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.AudioPlayBinding;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.AudioUrlBean;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.okhttp.Iview.IAudioPlayView;
import com.mymusic.musicplayer.okhttp.Presenter.AudioPlayPresenter;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by xiaoyu on 2017/12/8.
 */

public class AudioPlayActivity extends BaseActivity implements IAudioPlayView, View.OnClickListener {
    private static final int ROUTE = 21;
    AudioPlayBinding audioPlayBinding;
    private AudioPlayPresenter audioPlayPresenter = new AudioPlayPresenter(this);
    private boolean isPlaying = true;
    private String title;
    private int timelength;
    private int length;
    public MediaPlayer mediaPlayer;
    private String url;
    int progress = 0;
    private int i;
    private String s;
    private Timer timer;

    @Override
    int initview() {
        return R.layout.activity_audioplay;
    }

    @Override
    void initdatabinding() {
        audioPlayBinding = getBind();
        audioPlayBinding.setAudioPlayActivityonclick(this);


    }

    String a;
    @Override
    void initData() {
        Intent intent = getIntent();
        String thumbnail = intent.getStringExtra("thumbnail");
        title = intent.getStringExtra("title");
        length = timelength = intent.getIntExtra("timelength", 0);
        BookRankDetailsBean.SectionsBean sectionsBean = intent.getParcelableExtra("sectionsBean");
        audioPlayBinding.tvAudioplayTitle.setText(sectionsBean.getSection().getTitle());
        audioPlayBinding.seekbarAudioplay.setMax(sectionsBean.getSection().getLength());//设置seekbar的最大值为时间长度
        i = timelength % 60;
        s = (i < 10) ? (a = "0" + i) : (a = i + "");
        audioPlayBinding.tvAudioplayEndtime.setText("-" + timelength / 60 + ":" + s);
        Glide.with(this).load(thumbnail).into(audioPlayBinding.ivAudioplayCover);
        setDataTitle(title);
        setTitleRightimg(R.mipmap.f_icon04_sharet);
        setTitleLeftimg(R.mipmap.f_close);
        setTextVisible(View.GONE);
        audioPlayPresenter.getdata(sectionsBean.getSection().getId(), "section");
        audioPlayBinding.seekbarAudioplay.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /**
             * 进度改变
             *
             * @param seekBar
             * @param progress
             * @param fromUser
             */
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                audioPlayBinding.seekbarAudioplay.setProgress(progress);
//                timelength = length-progress;
//                i = timelength % 60;
//                s = (i < 10) ? (a = "0" + i) : (a = i + "");
//                audioPlayBinding.tvAudioplayEndtime.setText("-" + timelength / 60 + ":" + s);
                progress = progress;
            }

            /**
             * 开始拖动
             *
             * @param seekBar
             */
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            /**
             * 停止拖动
             *
             * @param seekBar
             */
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                audioPlayBinding.seekbarAudioplay.setProgress(progress);
                timelength = length - progress;
                i = timelength % 60;
                s = (i < 10) ? (a = "0" + i) : (a = i + "");
                audioPlayBinding.tvAudioplayEndtime.setText("-" + timelength / 60 + ":" + s);
            }
        });

    }

    private void SeekbarChange() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessageDelayed(ROUTE, 0);
            }
        }, 0, 1000);
    }


    private void initMedia() {
        mediaPlayer = new MediaPlayer();
        // 通过Uri解析一个网络地址
        Uri uri = Uri.parse(url);
        try {
            mediaPlayer.setDataSource(AudioPlayActivity.this, uri);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setdata(AudioUrlBean audioUrlBean) {
        url = audioUrlBean.getUrl();
        audioPlayBinding.setAudioUrlBean(audioUrlBean);
        initMedia();
        if (isPlaying) {
            SeekbarChange();
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_audioplay_play:
                isPlaying = !isPlaying;
                audioPlayBinding.ivAudioplayPlay.setImageResource(isPlaying ? R.mipmap.f_icon03_stop : R.mipmap.f_icon03_play);
                if (isPlaying) {//是否这个播放
                    mediaPlayer.start();
                    Log.e("start", "start===============");
                    SeekbarChange();
                } else {
                    mediaPlayer.pause();
                    handler.removeMessages(0);
                    timer.cancel();
                    Log.e("pause", "pause===============");
                }
                break;
        }
    }

    public static final int PROGRESS = 1;
    private Handler handler = new Handler() {


        public void handleMessage(Message msg) {
            if (msg.what == ROUTE) {
                handler.sendEmptyMessage(PROGRESS);

            }
            if (msg.what == PROGRESS) {
                progress++;
                timelength--;
                i = timelength % 60;
                s = (i < 10) ? (a = "0" + i) : (a = i + "");
                audioPlayBinding.tvAudioplayEndtime.setText("-" + timelength / 60 + ":" + s);
                audioPlayBinding.seekbarAudioplay.setProgress(progress);
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
           mediaPlayer.release();
    }

}
