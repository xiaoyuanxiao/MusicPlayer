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

public class RecommendEditorsPicksAdapter extends BaseListAdapter<RecommendationBean.EditorsPicksBean> {

    public RecommendEditorsPicksAdapter(Context context, List<RecommendationBean.EditorsPicksBean> data) {
        super(context, data);
    }

    @Override
    public int getCount() {
        if (super.getCount() == 0)
            return 0;
        if (super.getCount() >= 4)
            return 4;
        return super.getCount();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RecommendationBean.EditorsPicksBean editorsPicksBean = data.get(i);
        RecommendationBean.EditorsPicksBean.BookBean book = editorsPicksBean.getBook();
        RecommendationBean.EditorsPicksBean.BookBean.AuthorBean author = book.getAuthor();
        RecommendationBean.EditorsPicksBean.BookBean.RecorderBean recorder = book.getRecorder();
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.item_recommendeditorspicks_listview, null);
            holder.iv_editorspicks = (ImageView) view.findViewById(R.id.iv_editorspicks);
            holder.tv_editorspicks_title = (TextView) view.findViewById(R.id.tv_editorspicks_title);
            holder.tv_editorspicks_author = (TextView) view.findViewById(R.id.tv_editorspicks_author);
            holder.tv_editorspicks_description = (TextView) view.findViewById(R.id.tv_editorspicks_description);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(book.getCover()).into(holder.iv_editorspicks);
        holder.tv_editorspicks_title.setText(book.getTitle());
        holder.tv_editorspicks_author.setText(author.getTitle() + ": " + author.getName() + "     " + recorder.getTitle() + ": " + recorder.getName());
        holder.tv_editorspicks_description.setText(book.getDescription());
        return view;
    }

    class ViewHolder {
        ImageView iv_editorspicks;
        TextView tv_editorspicks_title;
        TextView tv_editorspicks_author;
        TextView tv_editorspicks_description;
    }
}
