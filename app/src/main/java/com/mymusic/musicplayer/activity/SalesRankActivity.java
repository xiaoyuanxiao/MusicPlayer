package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.AdapterView;

import com.mymusic.musicplayer.BR;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.SalesData;
import com.mymusic.musicplayer.adapter.BaseRecyleAdapter;
import com.mymusic.musicplayer.adapter.ListenerBookRankAdapter;
import com.mymusic.musicplayer.bean.RankingBean;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankView;
import com.mymusic.musicplayer.okhttp.Presenter.BookRankPersenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyu on 2017/11/29.
 */

public class SalesRankActivity extends BaseActivity implements IBookRankView, AdapterView.OnItemClickListener {

    private SalesData salesData;
    private LinearLayoutManager linearLayoutManager;
    private List<RankingBean.SalesBean.BooksBeanDes> salesBeen;
    private List<RankingBean.ListeningBean.PersonsBeanX> personsBean;
    private List<RankingBean.RecorderBeanRecond.RecordersBean> recordersBean;
    private BaseRecyleAdapter salesRankAdapter, personsRankAdapter, recordersRankAdapter;
    private BookRankPersenter bookRankPersenter = new BookRankPersenter(this);
    private String rank;
    private Intent intent;


    @Override
    int initview() {
        return R.layout.activity_salesrank;
    }

    @Override
    void initdatabinding() {
        salesData = getBind();
    }

    public void initData() {
        intent = getIntent();
        rank = intent.getStringExtra("rank");
        linearLayoutManager = new LinearLayoutManager(this);
        salesData.rvSalesRank.setLayoutManager(linearLayoutManager);

        if ("sales".equals(rank)) {
            salesBeen = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            map.put(R.layout.item_salesrank_sales, BR.salesBean);
            salesRankAdapter = new ListenerBookRankAdapter(salesBeen, map);
            salesData.rvSalesRank.setAdapter(salesRankAdapter);


        } else if ("persons".equals(rank)) {
            personsBean = new ArrayList<>();
            Map<Integer, Integer> map1 = new HashMap<>();
            map1.put(R.layout.item_salesrank_listening, BR.personBean);
            personsRankAdapter = new ListenerBookRankAdapter(personsBean, map1);
            salesData.rvSalesRank.setAdapter(personsRankAdapter);
        } else if ("recorder".equals(rank)) {
            recordersBean = new ArrayList<>();
            Map<Integer, Integer> map2 = new HashMap<>();
            map2.put(R.layout.item_salesrank_recorder, BR.recorderBean);
            recordersRankAdapter = new ListenerBookRankAdapter(recordersBean, map2);
            salesData.rvSalesRank.setAdapter(recordersRankAdapter);
        }
        bookRankPersenter.getData();
        salesData.refreshLayout.autoRefresh();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }



    @Override
    public void getAllData(RankingBean rankingBean) {
        salesData.refreshLayout.finishRefresh();
        if ("sales".equals(rank)) {
            List<RankingBean.SalesBean.BooksBeanDes> books = rankingBean.getSales().getBooks();
            salesBeen.clear();
            salesBeen.addAll(books);
            salesRankAdapter.notifyDataSetChanged();

        } else if ("persons".equals(rank)) {
            List<RankingBean.ListeningBean.PersonsBeanX> persons = rankingBean.getListening().getPersons();
            personsBean.clear();
            personsBean.addAll(persons);
            personsRankAdapter.notifyDataSetChanged();
        } else if ("recorder".equals(rank)) {
            List<RankingBean.RecorderBeanRecond.RecordersBean> recorders = rankingBean.getRecorder().getRecorders();
            recordersBean.clear();
            recordersBean.addAll(recorders);
            recordersRankAdapter.notifyDataSetChanged();
        }

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
