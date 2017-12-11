package com.mymusic.musicplayer;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


/**
 * Created by xiaoyu on 2017/11/14.
 */

public class MyApplication extends Application {
    private static Application app;
    public static int ID;
    public static final int PLAY_MAG = 1;//开始播放
    public static final int PAUSE = 2;//暂停播放

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        Logger.addLogAdapter(new AndroidLogAdapter() {
            @Override
            public boolean isLoggable(int priority, String tag) {
                //设置为Flase不打印
                return true;
            }
        });

    }

    public static Application getApp() {
        return app;
    }
}
