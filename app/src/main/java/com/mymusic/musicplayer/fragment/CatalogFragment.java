package com.mymusic.musicplayer.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.mymusic.musicplayer.BR;
import com.mymusic.musicplayer.CatalogBinding;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.CatalogAdapter;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyu on 2017/12/6.
 */

public class CatalogFragment extends MyBaseFragment {
    private LinearLayoutManager linearLayoutManager;
    CatalogBinding catalogBinding;
    private CatalogAdapter catalogAdapter;
    private BookRankDetailsBean.BookBean book;

    public static CatalogFragment newInstance() {
        CatalogFragment catalogFragment = new CatalogFragment();
        return catalogFragment;
    }

    @Override
    int initview() {
        return R.layout.fg_catalog;
    }

    @Override
    protected void initData() {
        super.initData();
        catalogBinding = getBind();
        getActivityData();
        linearLayoutManager = new LinearLayoutManager(getActivity());
        catalogBinding.rvCatalog.setLayoutManager(linearLayoutManager);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(R.layout.item_fg_catalog, BR.catalogBean);
        catalogAdapter = new CatalogAdapter(catalog, map, book);
        catalogBinding.rvCatalog.setAdapter(catalogAdapter);

    }

    List<BookRankDetailsBean.SectionsBean> catalog;
    private void getActivityData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            catalog = (List<BookRankDetailsBean.SectionsBean>) arguments.getSerializable("catalog");
            book = arguments.getParcelable("book");

        }
    }
}
