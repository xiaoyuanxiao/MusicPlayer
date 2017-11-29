package com.mymusic.musicplayer;

import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.orhanobut.logger.Logger;

import org.junit.Test;

import rx.Observable;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        ReHttpUtils.instans().httpRequestMain(new HttpSubCribe<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("========e" + e);

            }

            @Override
            public void onNext(String rankingBean) {
                System.out.println(rankingBean);
                Logger.d(rankingBean.toString());
            }

            @Override
            public Observable getObservable(MyRetroService retrofit) {
                return retrofit.getRankData();
            }
        });


    }

}