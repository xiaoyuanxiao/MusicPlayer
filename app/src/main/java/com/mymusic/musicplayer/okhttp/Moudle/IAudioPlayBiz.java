package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.okhttp.oncallback.AudioPlayListener;

/**
 * Created by xiaoyu on 2017/12/8.
 */

public interface IAudioPlayBiz {
    void getdata(AudioPlayListener audioPlayListener, int id, String type);
}
