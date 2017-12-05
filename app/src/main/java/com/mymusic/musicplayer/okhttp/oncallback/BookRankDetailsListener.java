package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.BookRankDetailsBean;

/**
 * Created by xiaoyu on 2017/12/5.
 */

public interface BookRankDetailsListener extends BaseOnlistener {
    void onSuccess(BookRankDetailsBean bookRankDetailsBean);
}
