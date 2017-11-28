package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.BookListBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IBookListView;
import com.mymusic.musicplayer.okhttp.Moudle.IBookListBiz;
import com.mymusic.musicplayer.okhttp.oncallback.BookListListener;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/28.
 */

public class BookListPersenter {
    private IBookListBiz iBookListBiz;
    private IBookListView iBookListView;

    public BookListPersenter(IBookListView iBookListView) {
        iBookListBiz = IBizFactory.getBookListBiz();
        this.iBookListView = iBookListView;
    }

    public void getdata() {
        iBookListBiz.getdata(new BookListListener() {
            @Override
            public void onFailure(String code) {

            }

            @Override
            public void onSuccess(List<BookListBean> bookListBean) {
                iBookListView.setBookListData(bookListBean);
            }
        });
    }
}
