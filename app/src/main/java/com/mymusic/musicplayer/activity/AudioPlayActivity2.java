package com.mymusic.musicplayer.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
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
import com.mymusic.musicplayer.service.MusicInterface;
import com.mymusic.musicplayer.service.MusicService;
import com.mymusic.musicplayer.service.PlayerService;

import java.text.SimpleDateFormat;

/**
 * Created by cc on 2018/1/6.
 */

public class AudioPlayActivity2 extends BaseActivity implements IAudioPlayView, View.OnClickListener {
    private static final int ROUTE = 21;
   static AudioPlayBinding audioPlayBinding;
    private AudioPlayPresenter audioPlayPresenter = new AudioPlayPresenter(this);
    private String title;
    public MediaPlayer mediaPlayer;
    public PlayerService playerService;
    private String url;
    private boolean tag2 = false;
    private SimpleDateFormat time = new SimpleDateFormat("mm:ss");
    private int length;
    private int timelength;
    private Uri uri;

    @Override
    int initview() {
        return R.layout.activity_audioplay;
    }

    @Override
    void initdatabinding() {
        audioPlayBinding = getBind();
        audioPlayBinding.setAudioPlayActivityonclick(this);
    }
   public static Handler handler = new Handler(){

        int currentposition;

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Bundle bundle = msg.getData();
            int duration = bundle.getInt("duration");
            currentposition = bundle.getInt("currentposition");
            audioPlayBinding.seekbarAudioplay.setMax(duration);
            audioPlayBinding.seekbarAudioplay.setProgress(currentposition);
        }
    };

    MusicInterface mi;
    @Override
    void initData() {
        Intent intent = getIntent();
        String thumbnail = intent.getStringExtra("thumbnail");
        title = intent.getStringExtra("title");
        length = timelength = intent.getIntExtra("timelength", 0);
        BookRankDetailsBean.SectionsBean sectionsBean = intent.getParcelableExtra("sectionsBean");
        audioPlayBinding.tvAudioplayTitle.setText(sectionsBean.getSection().getTitle());
        audioPlayBinding.seekbarAudioplay.setMax(sectionsBean.getSection().getLength());//设置seekbar的最大值为时间长度
        Glide.with(this).load(thumbnail).into(audioPlayBinding.ivAudioplayCover);
        setDataTitle(title);
        setTitleRightimg(R.mipmap.f_icon04_sharet);
        setTitleLeftimg(R.mipmap.f_close);
        setTextVisible(View.GONE);
        audioPlayPresenter.getdata(sectionsBean.getSection().getId(), "section");
        audioPlayBinding.seekbarAudioplay.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int progress = seekBar.getProgress();
                mi.seekto(progress);
            }
        });
        Intent intent1 = new Intent(this,PlayerService.class);
        MyServiceConn cnn = new MyServiceConn();

        //混合启动服务
        startService(intent1);
        bindService(intent1,cnn,BIND_AUTO_CREATE);

    }

    class MyServiceConn implements ServiceConnection{

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mi = (MusicInterface) service;
            Log.e("mi==============",mi+"");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e("onServiceDisconnected",mi+"");
        }
    }

    @Override
    public void setdata(AudioUrlBean audioUrlBean) {
        url = audioUrlBean.getUrl();
        audioPlayBinding.setAudioUrlBean(audioUrlBean);
        uri = Uri.parse(url);
        if(tag2){
            mi.pause();
        }else{
            mi.play(this,uri);
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_audioplay_play:
                tag2=!tag2;
                audioPlayBinding.ivAudioplayPlay.setImageResource(tag2 ? R.mipmap.f_icon03_play : R.mipmap.f_icon03_stop);
               if(tag2){
                   mi.pause();
               }else{
                   mi.continueplay();
               }

                break;
        }
    }
}
