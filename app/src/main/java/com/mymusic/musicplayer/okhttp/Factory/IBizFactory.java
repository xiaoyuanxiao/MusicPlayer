package com.mymusic.musicplayer.okhttp.Factory;

import com.mymusic.musicplayer.okhttp.Moudle.BizAudioPlay;
import com.mymusic.musicplayer.okhttp.Moudle.BizBookList;
import com.mymusic.musicplayer.okhttp.Moudle.BizBookRank;
import com.mymusic.musicplayer.okhttp.Moudle.BizBookRankDetails;
import com.mymusic.musicplayer.okhttp.Moudle.BizClassifyFragment;
import com.mymusic.musicplayer.okhttp.Moudle.BizListenerBookRecommend;
import com.mymusic.musicplayer.okhttp.Moudle.IAudioPlayBiz;
import com.mymusic.musicplayer.okhttp.Moudle.IBookListBiz;
import com.mymusic.musicplayer.okhttp.Moudle.IBookRankBiz;
import com.mymusic.musicplayer.okhttp.Moudle.IBookRankDetailsBiz;
import com.mymusic.musicplayer.okhttp.Moudle.IClassifyFragmentBiz;
import com.mymusic.musicplayer.okhttp.Moudle.IListenerBookRecommendBiz;

/**
 * Created by 小猴子 on 2017/4/7.
 * 所有I开头的JAVA文件皆是接口
 */

public class IBizFactory {
    public static IListenerBookRecommendBiz getListenerBookRecommendBiz() {
        return BizListenerBookRecommend.getInstanse();
    }

    public static IClassifyFragmentBiz getClassifyFragmentBiz() {
        return BizClassifyFragment.getInstanse();
    }

    public static IBookListBiz getBookListBiz() {
        return BizBookList.getInstanse();
    }

    public static IBookRankBiz getBookRankBiz() {
        return BizBookRank.getInstanse();
    }

    public static IBookRankDetailsBiz getBookRankDetailsBiz() {
        return BizBookRankDetails.getInstanse();
    }

    public static IAudioPlayBiz getAudioPlayBiz() {
        return BizAudioPlay.getInstanse();
    }
}
