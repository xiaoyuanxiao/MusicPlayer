package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.BookRankDetailsListener;

import rx.Observable;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public class BizBookRankDetails implements IBookRankDetailsBiz {
    private static BizBookRankDetails testMoudle;

    public synchronized static BizBookRankDetails getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizBookRankDetails();
        return testMoudle;
    }

    @Override
    public void getdata(final BookRankDetailsListener bookRankDetailsListener, final int id) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<BookRankDetailsBean>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(BookRankDetailsBean bookRankDetailsBean) {
                bookRankDetailsListener.onSuccess(bookRankDetailsBean);
            }

            @Override
            public Observable<BookRankDetailsBean> getObservable(MyRetroService retrofit) {
                return retrofit.getRankDetailsData(id);
            }
        });
    }
}
