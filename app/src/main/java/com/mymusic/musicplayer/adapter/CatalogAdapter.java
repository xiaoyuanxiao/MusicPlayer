package com.mymusic.musicplayer.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mymusic.musicplayer.ItemRankCatalogData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyu on 2017/12/6.
 */

public class CatalogAdapter extends BaseRecyleAdapter {
    ItemRankCatalogData itemRankCatalogData;
    private List<BookRankDetailsBean.SectionsBean> sectionBeen;

    public CatalogAdapter(List<?> data, Map<Integer, Integer> hashMap) {
        super(data, hashMap);
        sectionBeen = (List<BookRankDetailsBean.SectionsBean>) data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        itemRankCatalogData = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_fg_catalog, parent, false);
        return new ViewHolder(itemRankCatalogData);
    }

    String a;

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        float v = ((float) sectionBeen.get(position).getSection().getFile_size()) / 1024 / 1024;
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        int i = sectionBeen.get(position).getSection().getLength() % 60;
        if (i < 10) {
            a = "0" + i;
        } else {
            a = i + "";
        }
        itemRankCatalogData.tvCatalogDes.setText("时长： " + sectionBeen.get(position).getSection().getLength() / 60 + ":" + a + "  " + df.format(v) + " MB");
    }
}