package com.mymusic.musicplayer.okhttp.Iview;

import com.mymusic.musicplayer.bean.RankingBean;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public interface IBookRankView {
    void setAuthorData(RankingBean.AuthorBean authorData);

    void setListeningData(RankingBean.ListeningBean listeningData);

    void setNewArrivalsData(RankingBean.NewArrivalsBean newArrivalsData);

    void setRecorderData(RankingBean.RecorderBeanRecond recorderData);

    void setSalesData(RankingBean.SalesBean salesData);

    void setSpendingData(RankingBean.SpendingBean spendingData);
}
