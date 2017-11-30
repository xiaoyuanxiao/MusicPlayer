package com.mymusic.musicplayer.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.SalesData;
import com.mymusic.musicplayer.adapter.SalesRankAdapter;
import com.mymusic.musicplayer.bean.RankingBean;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankView;
import com.mymusic.musicplayer.okhttp.Presenter.BookRankPersenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public class SalesRankActivity extends BaseActivity implements IBookRankView {

    private SalesData salesData;
    private LinearLayoutManager linearLayoutManager;
    private List<RankingBean.SalesBean.BooksBeanDes> salesBeen;
    private SalesRankAdapter salesRankAdapter;
    private BookRankPersenter bookRankPersenter = new BookRankPersenter(this);


    @Override
    void initdatabinding() {
        salesData = DataBindingUtil.setContentView(this, R.layout.activity_salesrank);
    }

    @Override
    public void initData() {
        super.initData();
        linearLayoutManager = new LinearLayoutManager(this);
        salesData.rvSalesRank.setLayoutManager(linearLayoutManager);
        salesBeen = new ArrayList<>();
        salesRankAdapter = new SalesRankAdapter(salesBeen);
        salesData.rvSalesRank.setAdapter(salesRankAdapter);

        bookRankPersenter.getData();
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void setOnclick() {
    }
    @Override
    public void getAllData(RankingBean rankingBean) {
        salesBeen.clear();
        List<RankingBean.SalesBean.BooksBeanDes> books = rankingBean.getSales().getBooks();
        salesBeen.addAll(books);
        salesRankAdapter.notifyDataSetChanged();
    }
}
