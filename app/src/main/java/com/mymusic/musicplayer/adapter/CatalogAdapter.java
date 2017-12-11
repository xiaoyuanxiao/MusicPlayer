package com.mymusic.musicplayer.adapter;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mymusic.musicplayer.ItemRankCatalogData;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.activity.AudioPlayActivity;
import com.mymusic.musicplayer.bean.BookRankDetailsBean;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyu on 2017/12/6.
 */

public class CatalogAdapter extends BaseRecyleAdapter implements BaseRecyleAdapter.OnRecycleitemOnClic {
    ItemRankCatalogData itemRankCatalogData;
    private List<BookRankDetailsBean.SectionsBean> sectionBeen;
    private Context context;
    private BookRankDetailsBean.BookBean bookBean;
    private String timelength;

    public CatalogAdapter(List<?> data, Map<Integer, Integer> hashMap, BookRankDetailsBean.BookBean bookBean) {
        super(data, hashMap);
        sectionBeen = (List<BookRankDetailsBean.SectionsBean>) data;
        this.bookBean = bookBean;
        setOnRecycleitemOnClic(this);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        itemRankCatalogData = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_fg_catalog, parent, false);
        return new ViewHolder(itemRankCatalogData);
    }

    String a;
    int id;
    String title;
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
        boolean is_free = sectionBeen.get(position).getPricing().isIs_free();

        if (is_free) {
            itemRankCatalogData.tvItemCatlogDown.setBackgroundResource(R.drawable.corner_orangestroke);
            itemRankCatalogData.tvItemCatlogDown.setTextColor(ContextCompat.getColor(context, R.color.orange));
            itemRankCatalogData.tvItemCatlogDown.setText("下载");
        } else {
            itemRankCatalogData.tvItemCatlogDown.setBackgroundResource(R.drawable.corner_black);
            itemRankCatalogData.tvItemCatlogDown.setTextColor(ContextCompat.getColor(context, R.color.black));
            itemRankCatalogData.tvItemCatlogDown.setText(sectionBeen.get(position).getPricing().getPrice() + "朗币");
        }
        timelength = sectionBeen.get(position).getSection().getLength() / 60 + ":" + a;
        itemRankCatalogData.tvCatalogDes.setText("时长： " + timelength + "  " + df.format(v) + " MB");
    }

    @Override
    public void onItemClic(View view, int position) {
        Intent intent = new Intent(context, AudioPlayActivity.class);
        BookRankDetailsBean.SectionsBean sectionsBean = sectionBeen.get(position);
        intent.putExtra("sectionsBean", sectionsBean);
        intent.putExtra("thumbnail", bookBean.getThumbnail());
        intent.putExtra("title", bookBean.getTitle());
        intent.putExtra("timelength", sectionBeen.get(position).getSection().getLength());
        context.startActivity(intent);

    }
}
