package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.AudioUrlBean;

/**
 * Created by xiaoyu on 2017/12/8.
 */

public interface AudioPlayListener extends BaseOnlistener {
    void onSuccess(AudioUrlBean audioUrlBean);
}
