package com.mymusic.musicplayer.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.activity.SalesRankActivity;
import com.mymusic.musicplayer.bean.RankingBean;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankView;
import com.mymusic.musicplayer.okhttp.Presenter.BookRankPersenter;
import com.mymusic.musicplayer.utils.DynamicTimeFormat;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public class ListenerBookRankFragment extends BaseFragment implements IBookRankView {
    private RefreshLayout refreshLayout;
    private ClassicsHeader classicsHeader;
    private TextView tv_type_sales, tv_type_persons, tv_type_recorder;
    private TextView tv_listenerbookrank_sales_one, tv_listenerbookrank_sales_two, tv_listenerbookrank_sales_three, tv_listenerbookrank_sales_four;
    private TextView tv_listenerbookrank_persons_one, tv_listenerbookrank_persons_two, tv_listenerbookrank_persons_three, tv_listenerbookrank_persons_four;
    private TextView tv_listenerbookrank_recorder_one, tv_listenerbookrank_recorder_two, tv_listenerbookrank_recorder_three, tv_listenerbookrank_recorder_four;
    private BookRankPersenter bookRankPersenter = new BookRankPersenter(this);
    private RelativeLayout rl_listenerbookrank_sales, rl_listenerbookrank_persons, rl_listenerbookrank_recorder;


    public static ListenerBookRankFragment newInstance() {
        ListenerBookRankFragment listenerBookRankFragment = new ListenerBookRankFragment();
        return listenerBookRankFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbook_rank, null);
        refreshLayout = (RefreshLayout) inflate.findViewById(R.id.refreshLayout);
        tv_type_sales = (TextView) inflate.findViewById(R.id.tv_type_sales);
        tv_type_persons = (TextView) inflate.findViewById(R.id.tv_type_persons);
        tv_type_recorder = (TextView) inflate.findViewById(R.id.tv_type_recorder);

        rl_listenerbookrank_sales = (RelativeLayout) inflate.findViewById(R.id.rl_listenerbookrank_sales);
        rl_listenerbookrank_persons = (RelativeLayout) inflate.findViewById(R.id.rl_listenerbookrank_persons);
        rl_listenerbookrank_recorder = (RelativeLayout) inflate.findViewById(R.id.rl_listenerbookrank_recorder);


        tv_listenerbookrank_sales_one = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_sales_one);
        tv_listenerbookrank_sales_two = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_sales_two);
        tv_listenerbookrank_sales_three = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_sales_three);
        tv_listenerbookrank_sales_four = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_sales_four);

        tv_listenerbookrank_persons_one = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_persons_one);
        tv_listenerbookrank_persons_two = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_persons_two);
        tv_listenerbookrank_persons_three = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_persons_three);
        tv_listenerbookrank_persons_four = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_persons_four);

        tv_listenerbookrank_recorder_one = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_recorder_one);
        tv_listenerbookrank_recorder_two = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_recorder_two);
        tv_listenerbookrank_recorder_three = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_recorder_three);
        tv_listenerbookrank_recorder_four = (TextView) inflate.findViewById(R.id.tv_listenerbookrank_recorder_four);

        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        classicsHeader = (ClassicsHeader) refreshLayout.getRefreshHeader();
        classicsHeader.setTimeFormat(new DynamicTimeFormat("最后更新 %s"));
        refreshLayout.setEnableLoadmoreWhenContentNotFull(false);
        refreshLayout.autoRefresh();
        bookRankPersenter.getData();
    }

    @Override
    protected void setOnclick() {
        rl_listenerbookrank_sales.setOnClickListener(this);
        rl_listenerbookrank_persons.setOnClickListener(this);
        rl_listenerbookrank_recorder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_listenerbookrank_sales:
                startActivity(new Intent(getActivity(), SalesRankActivity.class));
                break;
            case R.id.rl_listenerbookrank_persons:

                break;
            case R.id.rl_listenerbookrank_recorder:

                break;
        }
    }


    @Override
    public void getAllData(RankingBean rankingBean) {
        refreshLayout.finishRefresh();
        RankingBean.SalesBean sales = rankingBean.getSales();
        List<RankingBean.SalesBean.BooksBeanDes> books = rankingBean.getSales().getBooks();
        tv_type_sales.setText(sales.getTitle());
        tv_listenerbookrank_sales_one.setText(books.get(0).getBook().getTitle());
        tv_listenerbookrank_sales_two.setText(books.get(1).getBook().getTitle());
        tv_listenerbookrank_sales_three.setText(books.get(2).getBook().getTitle());
        tv_listenerbookrank_sales_four.setText(books.get(3).getBook().getTitle() + "...");

        RankingBean.ListeningBean listening = rankingBean.getListening();
        List<RankingBean.ListeningBean.PersonsBeanX> persons = listening.getPersons();
        tv_type_persons.setText(listening.getTitle());
        tv_listenerbookrank_persons_one.setText(persons.get(0).getAccount().getNickname());
        tv_listenerbookrank_persons_two.setText(persons.get(1).getAccount().getNickname());
        tv_listenerbookrank_persons_three.setText(persons.get(2).getAccount().getNickname());
        tv_listenerbookrank_persons_four.setText(persons.get(3).getAccount().getNickname() + "...");

        RankingBean.RecorderBeanRecond recorder = rankingBean.getRecorder();
        List<RankingBean.RecorderBeanRecond.RecordersBean> recorders = recorder.getRecorders();

        tv_type_recorder.setText(recorder.getTitle());
        tv_listenerbookrank_recorder_one.setText(recorders.get(0).getName());
        tv_listenerbookrank_recorder_two.setText(recorders.get(1).getName());
        tv_listenerbookrank_recorder_three.setText(recorders.get(2).getName());
        tv_listenerbookrank_recorder_four.setText(recorders.get(3).getName() + "...");
    }
}
