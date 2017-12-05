package com.mymusic.musicplayer.okhttp.Moudle;

import com.mymusic.musicplayer.okhttp.oncallback.BookRankDetailsListener;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public interface IBookRankDetailsBiz {
    void getdata(BookRankDetailsListener bookRankDetailsListener, int id);
}
