package com.mymusic.musicplayer.okhttp.Moudle;

import android.util.Log;

import com.mymusic.musicplayer.bean.AudioUrlBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.AudioPlayListener;

import rx.Observable;

/**
 * Created by xiaoyu on 2017/12/8.
 */

public class BizAudioPlay implements IAudioPlayBiz {
    private static BizAudioPlay testMoudle;

    public synchronized static BizAudioPlay getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizAudioPlay();
        return testMoudle;
    }

    @Override
    public void getdata(final AudioPlayListener audioPlayListener, final int id, final String type) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<AudioUrlBean>() {

            @Override
            public void onError(Throwable e) {
                Log.e("BizAudioPlay",e+"");
            }

            @Override
            public void onNext(AudioUrlBean audioUrlBean) {
                audioPlayListener.onSuccess(audioUrlBean);
            }

            @Override
            public Observable<AudioUrlBean> getObservable(MyRetroService retrofit) {
                return retrofit.getAudioUrl(id, type);
            }
        });
    }
}
