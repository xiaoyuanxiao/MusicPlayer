package com.mymusic.musicplayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.RankDetailsBinding;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;
import com.mymusic.musicplayer.fragment.ListenerBookFragment;
import com.mymusic.musicplayer.fragment.RankSynopsisFragment;
import com.mymusic.musicplayer.okhttp.Iview.IBookRankDetailsView;
import com.mymusic.musicplayer.okhttp.Presenter.BookRankDetailsPresenter;
import com.mymusic.musicplayer.utils.RadioButtonImgUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/12/4.
 */

public class BookRankDetailsActivity extends BaseActivity implements IBookRankDetailsView, View.OnClickListener {

    private RankDetailsBinding detailsBinding;
    private BookRankDetailsPresenter bookRankDetailsPresenter = new BookRankDetailsPresenter(this);
    private FragmentManager fragmentManager;
    private List<Fragment> fragments;

    @Override
    void initdatabinding() {
        detailsBinding = getBind();
        int[] drawables = {R.mipmap.h_icon04_collect, R.mipmap.h_icon04_share,
                R.mipmap.h_icon04_comment};
        RadioButtonImgUtil.setRadioButtonImg(this, drawables, 25, detailsBinding.tvBookrankdetailFavorite, detailsBinding.tvBookrankdetailShare, detailsBinding.tvBookrankdetailComment);
        detailsBinding.setBookRankDetailsActivityclick(this);
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
        fragments = new ArrayList<>();
        fragmentManager = getSupportFragmentManager();

    }

    public void showFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragment(transaction);
        if (fragment.isAdded()) {
            transaction.show(fragment);
        } else {
            transaction.add(R.id.ll_container, fragment, fragment.getClass().getName());
        }
        transaction.commit();
    }

    /**
     * 隐藏其他fragment
     *
     * @param transaction 控制器
     */
    private void hideFragment(FragmentTransaction transaction) {
        for (int i = 0; fragments.size() > i; i++) {
            if (fragments.get(i).isVisible()) {
                transaction.hide(fragments.get(i));
            }
        }
    }

    String description;

    @Override
    public void getdata(BookRankDetailsBean bookRankDetailsBean) {
        detailsBinding.setDetailsBean(bookRankDetailsBean);
        RankSynopsisFragment rankSynopsisFragment = RankSynopsisFragment.newInstance();
        Bundle bundle = new Bundle();
        bundle.putString("Synopsis", bookRankDetailsBean.getBook().getDescription());//这里的values就是我们要传的值
        rankSynopsisFragment.setArguments(bundle);
        fragments.add(rankSynopsisFragment);
        fragments.add(ListenerBookFragment.newInstance());
        fragments.add(ListenerBookFragment.newInstance());
        showFragment(fragments.get(0));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_bookrankdetail_synopsis:
                showFragment(fragments.get(0));
                break;
            case R.id.rb_bookrankdetail_comment:
                showFragment(fragments.get(1));
                break;
            case R.id.rb_bookrankdetail_catalog:
                showFragment(fragments.get(2));
                break;
        }
    }
}
