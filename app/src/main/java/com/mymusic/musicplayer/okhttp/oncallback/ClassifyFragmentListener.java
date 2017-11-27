package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.ClassifyBean;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public interface ClassifyFragmentListener extends BaseOnlistener {
    void onSuccess(ClassifyBean classifyBean);
}
