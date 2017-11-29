package com.mymusic.musicplayer.fragment;

import android.view.View;
import android.widget.TextView;

import com.mymusic.musicplayer.R;
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
        bookRankPersenter.getData();
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public void setAuthorData(RankingBean.AuthorBean authorData) {

    }

    /**
     * 听书达人榜
     *
     * @param listeningData
     */
    @Override
    public void setListeningData(RankingBean.ListeningBean listeningData) {
        tv_type_persons.setText(listeningData.getTitle());
        List<RankingBean.ListeningBean.PersonsBeanX> persons = listeningData.getPersons();
        tv_listenerbookrank_persons_one.setText(persons.get(0).getAccount().getNickname());
        tv_listenerbookrank_persons_two.setText(persons.get(1).getAccount().getNickname());
        tv_listenerbookrank_persons_three.setText(persons.get(2).getAccount().getNickname());
        tv_listenerbookrank_persons_four.setText(persons.get(3).getAccount().getNickname() + "...");
    }

    @Override
    public void setNewArrivalsData(RankingBean.NewArrivalsBean newArrivalsData) {

    }

    /**
     * 播音榜单
     *
     * @param recorderData
     */
    @Override
    public void setRecorderData(RankingBean.RecorderBeanRecond recorderData) {
        tv_type_recorder.setText(recorderData.getTitle());
        List<RankingBean.RecorderBeanRecond.RecordersBean> recorders = recorderData.getRecorders();
        tv_listenerbookrank_recorder_one.setText(recorders.get(0).getName());
        tv_listenerbookrank_recorder_two.setText(recorders.get(1).getName());
        tv_listenerbookrank_recorder_three.setText(recorders.get(2).getName());
        tv_listenerbookrank_recorder_four.setText(recorders.get(3).getName() + "...");
    }

    /**
     * 畅听榜
     *
     * @param salesData
     */
    @Override
    public void setSalesData(RankingBean.SalesBean salesData) {
        tv_type_sales.setText(salesData.getTitle());
        List<RankingBean.SalesBean.BooksBeanX> books = salesData.getBooks();
        tv_listenerbookrank_sales_one.setText(books.get(0).getBook().getTitle());
        tv_listenerbookrank_sales_two.setText(books.get(1).getBook().getTitle());
        tv_listenerbookrank_sales_three.setText(books.get(2).getBook().getTitle());
        tv_listenerbookrank_sales_four.setText(books.get(3).getBook().getTitle() + "...");

    }

    @Override
    public void setSpendingData(RankingBean.SpendingBean spendingData) {

    }
}
