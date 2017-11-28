package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.BookListBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public interface BookListListener extends BaseOnlistener {
    void onSuccess(List<BookListBean> bookListBean);
}
