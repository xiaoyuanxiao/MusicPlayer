package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
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

public class RecommendEditorsPicksAdapter extends RecyclerView.Adapter<RecommendEditorsPicksAdapter.ViewHolder> {
    List<RecommendationBean.EditorsPicksBean> list;

    public RecommendEditorsPicksAdapter(List<RecommendationBean.EditorsPicksBean> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = View.inflate(parent.getContext(), R.layout.item_recommendeditorspicks_listview, null);
        RecommendEditorsPicksAdapter.ViewHolder viewHolder = new RecommendEditorsPicksAdapter.ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecommendEditorsPicksAdapter.ViewHolder holder, int position) {
        RecommendationBean.EditorsPicksBean editorsPicksBean = list.get(position);
        RecommendationBean.EditorsPicksBean.BookBean book = editorsPicksBean.getBook();
        RecommendationBean.EditorsPicksBean.BookBean.AuthorBean author = book.getAuthor();
        RecommendationBean.EditorsPicksBean.BookBean.RecorderBean recorder = book.getRecorder();

        Glide.with(holder.tv_editorspicks_title.getContext()).load(book.getCover()).into(holder.iv_editorspicks);
        holder.tv_editorspicks_title.setText(book.getTitle());
        holder.tv_editorspicks_author.setText(author.getTitle() + ": " + author.getName() + "     " + recorder.getTitle() + ": " + recorder.getName());
        holder.tv_editorspicks_description.setText(book.getDescription());
    }

    @Override
    public int getItemCount() {
        if (list == null)
            return 0;
        if (list.size() > 4)
            return 4;
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_editorspicks;
        TextView tv_editorspicks_title;
        TextView tv_editorspicks_author;
        TextView tv_editorspicks_description;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_editorspicks = (ImageView) itemView.findViewById(R.id.iv_editorspicks);
            tv_editorspicks_title = (TextView) itemView.findViewById(R.id.tv_editorspicks_title);
            tv_editorspicks_author = (TextView) itemView.findViewById(R.id.tv_editorspicks_author);
            tv_editorspicks_description = (TextView) itemView.findViewById(R.id.tv_editorspicks_description);
        }
    }
}
