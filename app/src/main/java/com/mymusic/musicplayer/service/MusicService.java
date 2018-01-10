package com.mymusic.musicplayer.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;


public class MusicService extends Service {
    public MediaPlayer mediaPlayer;
    public boolean tag = false;
    private String uri;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (!intent.getStringExtra("uri").equals(uri)) {
            uri = intent.getStringExtra("uri");
            try {
                // mediaPlayer.release();
                tag = false;
                mediaPlayer.reset();
                mediaPlayer.setDataSource(uri);
                mediaPlayer.prepare();
                mediaPlayer.setLooping(true);
            } catch (Exception e) {
                e.printStackTrace();

            }
        } else {
            mediaPlayer.pause();
            tag = false;
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
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    public void onDestroy() {
        //销毁音乐
        Log.i("tag", "onDestroy====MusicService");
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.release();
        mediaPlayer = null;
        stop();
        super.onDestroy();
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

