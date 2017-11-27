package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.ClassifyFragmentListener;

import rx.Observable;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class BizClassifyFragment implements IClassifyFragmentBiz {
    private static BizClassifyFragment testMoudle;

    public synchronized static BizClassifyFragment getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizClassifyFragment();
        return testMoudle;
    }


    @Override
    public void getdata(final ClassifyFragmentListener classifyFragmentListener) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<ClassifyBean>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ClassifyBean classifyBean) {
                classifyFragmentListener.onSuccess(classifyBean);
            }

            @Override
            public Observable<ClassifyBean> getObservable(MyRetroService retrofit) {
                return retrofit.getClassifyData();
            }
        });
    }
}
