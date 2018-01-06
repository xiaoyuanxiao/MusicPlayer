package com.mymusic.musicplayer.service;

import android.content.Context;
import android.net.Uri;

/**
 * Created by cc on 2018/1/6.
 */

public interface MusicInterface {
    void play(Context context, Uri uri);
    void pause();
    void continueplay();
    void seekto(int currentposition);
    void setstarttime(int starttime);
    void setsendtime(int endtime);
}