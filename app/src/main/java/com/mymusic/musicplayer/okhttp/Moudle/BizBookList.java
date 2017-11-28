package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.bean.BookListBean;
import com.mymusic.musicplayer.mynet.HttpSubCribe;
import com.mymusic.musicplayer.mynet.MyRetroService;
import com.mymusic.musicplayer.mynet.ReHttpUtils;
import com.mymusic.musicplayer.okhttp.oncallback.BookListListener;

import java.util.List;

import rx.Observable;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public class BizBookList implements IBookListBiz {
    private static BizBookList testMoudle;

    public synchronized static BizBookList getInstanse() {
        if (testMoudle == null)
            testMoudle = new BizBookList();
        return testMoudle;
    }

    @Override
    public void getdata(final BookListListener bookListListener) {
        ReHttpUtils.instans().httpRequest(new HttpSubCribe<List<BookListBean>>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<BookListBean> bookListBean) {
                bookListListener.onSuccess(bookListBean);
            }

            @Override
            public Observable<List<BookListBean>> getObservable(MyRetroService retrofit) {
                return retrofit.getBookListData();
            }
        });
    }
}
