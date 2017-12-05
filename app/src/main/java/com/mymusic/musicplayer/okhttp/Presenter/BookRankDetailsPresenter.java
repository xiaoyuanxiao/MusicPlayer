package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankDetailsView;
import com.mymusic.musicplayer.okhttp.Moudle.IBookRankDetailsBiz;
import com.mymusic.musicplayer.okhttp.oncallback.BookRankDetailsListener;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public class BookRankDetailsPresenter {
    IBookRankDetailsBiz iBookRankDetailsBiz;
    IBookRankDetailsView iBookRankDetailsView;

    public BookRankDetailsPresenter(IBookRankDetailsView iBookRankDetailsView) {
        iBookRankDetailsBiz = IBizFactory.getBookRankDetailsBiz();
        this.iBookRankDetailsView = iBookRankDetailsView;
    }

    public void getdata(int id) {
        iBookRankDetailsBiz.getdata(new BookRankDetailsListener() {
            @Override
            public void onSuccess(BookRankDetailsBean bookRankDetailsBean) {
                iBookRankDetailsView.getdata(bookRankDetailsBean);
            }

            @Override
            public void onFailure(String code) {

            }
        }, id);
    }
}
