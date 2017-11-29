package com.mymusic.musicplayer.okhttp.Moudle;

import android.util.Log;

import com.mymusic.musicplayer.bean.RankingBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.BookRankListener;

import rx.Observable;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public class BizBookRank implements IBookRankBiz {
    private static BizBookRank testMoudle;

    public synchronized static BizBookRank getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizBookRank();
        return testMoudle;
    }

    @Override
    public void getData(final BookRankListener bookRankListener) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<RankingBean>() {

            @Override
            public void onError(Throwable e) {
                Log.e("e", e.toString());

            }

            @Override
            public void onNext(RankingBean rankingBean) {

                bookRankListener.onSuccess(rankingBean);
            }

            @Override
            public Observable getObservable(MyRetroService retrofit) {
                return retrofit.getRankData();
            }
        });
    }
}
