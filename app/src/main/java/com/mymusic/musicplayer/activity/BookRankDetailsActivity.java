package com.mymusic.musicplayer.activity;

import android.content.Intent;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.RankDetailsBinding;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankDetailsView;
import com.mymusic.musicplayer.okhttp.Presenter.BookRankDetailsPresenter;
import com.mymusic.musicplayer.utils.RadioButtonImgUtil;

/**
 * Created by xiaoyu on 2017/12/4.
 */

public class BookRankDetailsActivity extends BaseActivity implements IBookRankDetailsView {

    private RankDetailsBinding detailsBinding;
    private BookRankDetailsPresenter bookRankDetailsPresenter = new BookRankDetailsPresenter(this);

    @Override
    void initdatabinding() {
        detailsBinding = getBind();
        int[] drawables = {R.mipmap.h_icon04_collect, R.mipmap.h_icon04_share,
                R.mipmap.h_icon04_comment};
        RadioButtonImgUtil.setRadioButtonImg(this, drawables, 25, detailsBinding.tvBookrankdetailFavorite, detailsBinding.tvBookrankdetailShare, detailsBinding.tvBookrankdetailComment);
    }

    @Override
    int initview() {
        return R.layout.activity_bookrankdetails;
    }

    @Override
    void initData() {
        Intent intent = getIntent();
        int id = intent.getIntExtra("ID", 0);
        bookRankDetailsPresenter.getdata(id);
    }

    @Override
    public void getdata(BookRankDetailsBean bookRankDetailsBean) {
        detailsBinding.setDetailsBean(bookRankDetailsBean);
    }
}
