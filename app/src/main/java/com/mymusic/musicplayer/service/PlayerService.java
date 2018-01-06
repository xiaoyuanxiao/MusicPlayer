package com.mymusic.musicplayer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;

import com.mymusic.musicplayer.activity.AudioPlayActivity;
import com.mymusic.musicplayer.activity.AudioPlayActivity2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class PlayerService extends Service {
   public  MediaPlayer player;
    Timer timer;
    private SimpleDateFormat time = new SimpleDateFormat("mm:ss");
    public PlayerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        // throw new UnsupportedOperationException("Not yet implemented");
        return new MusicController();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        player=new MediaPlayer();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
        player.release();
        player = null;
        if (timer!=null){
            timer.cancel();
            timer=null;
        }
    }

    public class MusicController extends Binder implements MusicInterface{
        public void play(Context context,Uri uri){
            PlayerService.this.play(context,uri);
        }
        public void pause(){
            PlayerService.this.pause();
        }

        @Override
        public void continueplay() {
            PlayerService.this.continueplay();
        }

        @Override
        public void seekto(int currentposition) {
            PlayerService.this.seekto(currentposition);
        }

        @Override
        public void setstarttime(int starttime) {
            PlayerService.this.setstarttime(starttime);
        }

        @Override
        public void setsendtime(int endtime) {
            PlayerService.this.setendtime(endtime);
        }

    }

    public void setstarttime(int starttime){
        player.seekTo(starttime);
    }

    public void setendtime(int endtime){
        player.seekTo(endtime);
    }

    public void seekto(int currentposition){
        player.seekTo(currentposition);
    }


    public void play(Context context, Uri uri) {
        System.out.println("播放音乐");

        player.reset();
        try {
//            player.setDataSource("sdcard/heibaizhao.mp3");
//            player.prepare();//准备
//            player.start();
        //    player.setDataSource("http://sc1.111ttt.cn/2016/1/10/29/203291210339.mp3");
            player.setDataSource(context,uri);
            System.out.println("连接成功");
            player.prepareAsync();
            player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    System.out.println("加载成功");
                    player.start();
                    addTimer();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void continueplay(){
        player.start();
    }

    public void pause() {
        System.out.println("暂停");
        player.pause();
    }
    public void addTimer(){

        if(timer==null){

            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int duration = player.getDuration();
                    int currentposition = player.getCurrentPosition();

                    Message msg = AudioPlayActivity2.handler.obtainMessage();

                    Bundle bundle = new Bundle();
                    bundle.putInt("duration", duration);
                    bundle.putInt("currentposition", currentposition);

                    msg.setData(bundle);

                    AudioPlayActivity2.handler.sendMessage(msg);


                }
            }, 5, 500);
        }
    }
}