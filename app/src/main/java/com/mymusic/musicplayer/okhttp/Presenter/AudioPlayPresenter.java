package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.AudioUrlBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IAudioPlayView;
import com.mymusic.musicplayer.okhttp.Moudle.IAudioPlayBiz;
import com.mymusic.musicplayer.okhttp.oncallback.AudioPlayListener;

/**
 * Created by xiaoyu on 2017/12/8.
 */

public class AudioPlayPresenter {
    IAudioPlayBiz iAudioPlayBiz;
    IAudioPlayView iAudioPlayView;

    public AudioPlayPresenter(IAudioPlayView iAudioPlayView) {
        iAudioPlayBiz = IBizFactory.getAudioPlayBiz();
        this.iAudioPlayView = iAudioPlayView;
    }

    public void getdata(int id, String type) {
        iAudioPlayBiz.getdata(new AudioPlayListener() {
            @Override
            public void onSuccess(AudioUrlBean audioUrlBean) {
                iAudioPlayView.setdata(audioUrlBean);
            }

            @Override
            public void onFailure(String code) {

            }
        }, id, type);
    }
}
