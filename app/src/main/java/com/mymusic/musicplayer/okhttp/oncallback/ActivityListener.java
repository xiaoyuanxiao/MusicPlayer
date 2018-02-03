package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.ActivityBean;

import java.util.List;

/**
 * Created by cc on 2018/1/31.
 */

public interface ActivityListener extends BaseOnlistener {
    void onSuccess(List<ActivityBean> activityBeanList);
}
