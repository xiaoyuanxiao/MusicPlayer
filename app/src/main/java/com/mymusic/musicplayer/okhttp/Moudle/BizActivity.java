package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.bean.ActivityBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.ActivityListener;

import java.util.List;

import rx.Observable;

/**
 * Created by cc on 2018/1/31.
 */

public class BizActivity implements IActivityListBiz{
    private static BizActivity testMoudle;

    public synchronized static BizActivity getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizActivity();
        return testMoudle;
    }
    @Override
    public void getData(final ActivityListener listener) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<List<ActivityBean>>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<ActivityBean> accountBeans) {
                listener.onSuccess(accountBeans);
            }

            @Override
            public Observable<List<ActivityBean>> getObservable(MyRetroService retrofit) {
                return retrofit.getAcitivityData();
            }
        });
    }
}
