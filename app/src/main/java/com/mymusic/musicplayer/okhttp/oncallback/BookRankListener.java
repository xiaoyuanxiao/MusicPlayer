package com.mymusic.musicplayer.okhttp.oncallback;

import com.mymusic.musicplayer.bean.RankingBean;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public interface BookRankListener extends BaseOnlistener {
    void onSuccess(RankingBean rankingBean);

}
