package com.mymusic.musicplayer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/16.
 */

public class RecommendNewarrivalsAdapter extends BaseListAdapter<RecommendationBean.NewArrivalsBean> {

    public RecommendNewarrivalsAdapter(Context context, List<RecommendationBean.NewArrivalsBean> data) {
        super(context, data);
    }

    @Override
    public int getCount() {
        if (super.getCount() == 0)
            return 0;
        if (super.getCount() >= 6)
            return 6;
        return super.getCount();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RecommendationBean.NewArrivalsBean newArrivalsBean = data.get(i);
        RecommendationBean.NewArrivalsBean.BookBeanXX book = newArrivalsBean.getBook();
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.item_recommend_listview1, null);
            holder.iv_cover = (ImageView) view.findViewById(R.id.iv_cover);
            holder.tv_title = (TextView) view.findViewById(R.id.tv_title);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(book.getCover()).into(holder.iv_cover);
        holder.tv_title.setText(book.getTitle());
        return view;
    }

    class ViewHolder {
        ImageView iv_cover;
        TextView tv_title;
    }
}
