package com.mymusic.musicplayer.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.ListenerBookListAdapter;
import com.mymusic.musicplayer.bean.BookListBean;
import com.mymusic.musicplayer.okhttp.Iview.IBookListView;
import com.mymusic.musicplayer.okhttp.Presenter.BookListPersenter;
import com.mymusic.musicplayer.utils.DynamicTimeFormat;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/11/23.
 */

public class ListenerBookListsFragment extends BaseFragment implements IBookListView {
    private RefreshLayout mRefreshLayout;
    private ClassicsHeader mClassicsHeader;
    private RecyclerView rv_listenerbooklists;
    private LinearLayoutManager LayoutManager;
    private BookListPersenter bookListPersenter = new BookListPersenter(this);
    private List<BookListBean> bookListBean;
    private ListenerBookListAdapter listenerBookListAdapter;


    public static ListenerBookListsFragment newInstance() {
        ListenerBookListsFragment listenerBookListsFragment = new ListenerBookListsFragment();
        return listenerBookListsFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_listenerbooklists, null);
        mRefreshLayout = (RefreshLayout) inflate.findViewById(R.id.refreshLayout);
        rv_listenerbooklists = (RecyclerView) inflate.findViewById(R.id.rv_listenerbooklists);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        mClassicsHeader = (ClassicsHeader) mRefreshLayout.getRefreshHeader();
        mClassicsHeader.setTimeFormat(new DynamicTimeFormat("最后更新 %s"));

        LayoutManager = new LinearLayoutManager(getActivity());
        LayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_listenerbooklists.setLayoutManager(LayoutManager);
        bookListBean = new ArrayList<>();
        listenerBookListAdapter = new ListenerBookListAdapter(bookListBean);
        rv_listenerbooklists.setAdapter(listenerBookListAdapter);

        bookListPersenter.getdata();

    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public void setBookListData(List<BookListBean> bookListBean) {
        this.bookListBean.clear();
        this.bookListBean.addAll(bookListBean);
        listenerBookListAdapter.notifyDataSetChanged();
    }
}
