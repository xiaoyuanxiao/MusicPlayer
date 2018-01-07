package com.mymusic.musicplayer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;

import retrofit2.http.Url;

public class MusicService extends Service {
    public MediaPlayer mediaPlayer;
    public boolean tag = false;
    private String uri;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        uri = intent.getStringExtra("uri");
        try {
            mediaPlayer.setDataSource(uri);
            //mediaPlayer.setDataSource("http://jyts-public-oss.longruncloud.com/audios/fd84ee7bc5408a1b2b183f05922ce19684af39ec1654be0cf41a655b6fe8ab2c.mp3");
            //mediaPlayer.setDataSource("http://sc1.111ttt.cn/2016/1/10/29/203291210339.mp3");
            mediaPlayer.prepare();
            mediaPlayer.setLooping(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    public MusicService() {
        mediaPlayer = new MediaPlayer();

    }

    //  通过 Binder 来保持 Activity 和 Service 的通信
    public MyBinder binder = new MyBinder();
    public class MyBinder extends Binder {
       public MusicService getService() {
            return MusicService.this;
        }
    }

    public void playOrPause() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }
    }

    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            try {
                mediaPlayer.reset();
             //   mediaPlayer.setDataSource("/data/music.mp3");
                mediaPlayer.setDataSource(uri);
              //  mediaPlayer.setDataSource("http://sc1.111ttt.cn/2016/1/10/29/203291210339.mp3");
                mediaPlayer.prepare();
                mediaPlayer.seekTo(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}

