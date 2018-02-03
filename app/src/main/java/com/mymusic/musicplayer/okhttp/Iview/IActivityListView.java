package com.mymusic.musicplayer.okhttp.Iview;

import com.mymusic.musicplayer.bean.ActivityBean;
import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.bean.RankingBean;

import java.util.List;

/**
 * Created by cc on 2018/1/31.
 */

public interface IActivityListView {
    void setActivityList(List<ActivityBean> activityList);
}
