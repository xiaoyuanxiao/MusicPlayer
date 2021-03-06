package com.mymusic.musicplayer.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.AudioPlayBinding;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.AudioUrlBean;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.okhttp.Iview.IAudioPlayView;
import com.mymusic.musicplayer.okhttp.Presenter.AudioPlayPresenter;
import com.mymusic.musicplayer.service.MusicService;

import java.text.SimpleDateFormat;


/**
 * Created by xiaoyu on 2017/12/8.
 */

public class AudioPlayActivity extends BaseActivity implements IAudioPlayView, View.OnClickListener {
    AudioPlayBinding audioPlayBinding;
    private AudioPlayPresenter audioPlayPresenter = new AudioPlayPresenter(this);
    private String title;
    private String url;
    private MusicService musicService;
    private SimpleDateFormat time = new SimpleDateFormat("mm:ss");
    private Intent intent;

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
        title = intent.getStringExtra("title");
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
                if (fromUser == true) {
                    musicService.mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    //  在Activity中调用 bindService 保持与 Service 的通信
    private void bindServiceConnection() {
        intent = new Intent(AudioPlayActivity.this, MusicService.class);
        intent.putExtra("uri", url);
        startService(intent);
        bindService(intent, serviceConnection, this.BIND_AUTO_CREATE);
    }

    //  回调onServiceConnected 函数，通过IBinder 获取 Service对象，实现Activity与 Service的绑定
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            musicService = ((MusicService.MyBinder) (service)).getService();
            Log.i("musicService", musicService + "");
            audioPlayBinding.tvAudioplayEndtime.setText(time.format(musicService.mediaPlayer.getDuration()));
            //  由tag的变换来控制事件的调用

            audioPlayBinding.ivAudioplayPlay.setImageResource(musicService.tag ? R.mipmap.f_icon03_play : R.mipmap.f_icon03_stop);

            //  由tag的变换来控制事件的调用
            if (musicService.tag != true) {
               handler.post(runnable);
                musicService.playOrPause();
                musicService.tag = true;

            } else {
                musicService.playOrPause();
                musicService.tag = false;
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            musicService = null;
        }
    };

//        btnStop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                musicStatus.setText("Stopped");
//                btnPlayOrPause.setText("PLAY");
//                musicService.stop();
//                animator.pause();
//                musicService.tag = false;
//            }
//        });

//        //  停止服务时，必须解除绑定，写入btnQuit按钮中
//        btnQuit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                handler.removeCallbacks(runnable);
//                unbindService(serviceConnection);
//                Intent intent = new Intent(MainActivity1.this, MusicService.class);
//                stopService(intent);
//                try {
//                    MainActivity1.this.finish();
//                } catch (Exception e) {
//
//                }
//            }
//        });


    @Override
    public void setdata(AudioUrlBean audioUrlBean) {
        url = audioUrlBean.getUrl();
        audioPlayBinding.setAudioUrlBean(audioUrlBean);

        bindServiceConnection();
    }

    //  通过 Handler 更新 UI 上的组件状态
    public Handler handler = new Handler();
    public Runnable runnable = new Runnable() {
        @Override
        public void run() {
            audioPlayBinding.tvAudioplayStarttime.setText(time.format(musicService.mediaPlayer.getCurrentPosition()));
            audioPlayBinding.seekbarAudioplay.setProgress(musicService.mediaPlayer.getCurrentPosition());
            audioPlayBinding.seekbarAudioplay.setMax(musicService.mediaPlayer.getDuration());
            audioPlayBinding.tvAudioplayEndtime.setText(time.format(musicService.mediaPlayer.getDuration()));
            handler.postDelayed(runnable, 1000);

        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_audioplay_play:
                audioPlayBinding.ivAudioplayPlay.setImageResource(musicService.tag ? R.mipmap.f_icon03_play : R.mipmap.f_icon03_stop);
                if (musicService.mediaPlayer != null) {
                    audioPlayBinding.seekbarAudioplay.setProgress(musicService.mediaPlayer.getCurrentPosition());
                    audioPlayBinding.seekbarAudioplay.setMax(musicService.mediaPlayer.getDuration());
                }
                //  由tag的变换来控制事件的调用
                if (musicService.tag != true) {
                    handler.post(runnable);
                    musicService.playOrPause();
                    musicService.tag = true;

                } else {
                    musicService.playOrPause();
                    musicService.tag = false;
                }
                break;
        }
    }

    //  获取并设置返回键的点击事件
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            handler.removeCallbacks(runnable);
            unbindService(serviceConnection);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
