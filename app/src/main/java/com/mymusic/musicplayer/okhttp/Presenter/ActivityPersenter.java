package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.ActivityBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IActivityListView;
import com.mymusic.musicplayer.okhttp.Moudle.IActivityListBiz;
import com.mymusic.musicplayer.okhttp.oncallback.ActivityListener;

import java.util.List;

/**
 * Created by cc on 2018/1/31.
 */

public class ActivityPersenter {
    IActivityListBiz iActivityListBiz;
    IActivityListView iActivityListView;

    public ActivityPersenter(IActivityListView iActivityListView) {
        iActivityListBiz = IBizFactory.getActivityBiz();
        this.iActivityListView = iActivityListView;
    }

    public void getdata(){
        iActivityListBiz.getData(new ActivityListener() {
            @Override
            public void onSuccess(List<ActivityBean> activityBeanList) {
                iActivityListView.setActivityList(activityBeanList);
            }

            @Override
            public void onFailure(String code) {

            }
        });
    }
}
