package com.mymusic.musicplayer.okhttp.Factory;

import com.mymusic.musicplayer.okhttp.Moudle.BizListenerBookRecommend;
import com.mymusic.musicplayer.okhttp.Moudle.IListenerBookRecommendBiz;

/**
 * Created by 小猴子 on 2017/4/7.
 * 所有I开头的JAVA文件皆是接口
 */

public class IBizFactory {
    public static IListenerBookRecommendBiz getListenerBookRecommendBiz() {
        return BizListenerBookRecommend.getInstanse();
    }

}
