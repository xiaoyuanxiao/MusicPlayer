package com.mymusic.musicplayer.okhttp.Presenter;

import android.util.Log;

import com.mymusic.musicplayer.bean.RankingBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankView;
import com.mymusic.musicplayer.okhttp.Moudle.IBookRankBiz;
import com.mymusic.musicplayer.okhttp.oncallback.BookRankListener;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public class BookRankPersenter {
    IBookRankBiz iBookRankBiz;
    IBookRankView iBookRankView;

    public BookRankPersenter(IBookRankView iBookRankView) {
        iBookRankBiz = IBizFactory.getBookRankBiz();
        this.iBookRankView = iBookRankView;
    }

    public void getData() {
        iBookRankBiz.getData(new BookRankListener() {
            @Override
            public void onSuccess(RankingBean rankingBean) {
                iBookRankView.getAllData(rankingBean);
            }

            @Override
            public void onFailure(String code) {
                Log.e("code", code);
            }
        });
    }
}
