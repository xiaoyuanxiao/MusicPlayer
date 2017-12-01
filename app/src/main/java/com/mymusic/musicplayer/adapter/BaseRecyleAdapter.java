package com.mymusic.musicplayer.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by burning on 2017/11/22.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 * -------------------------//┏┓　　　┏┓
 * -------------------------//┏┛┻━━━┛┻┓
 * -------------------------//┃　　　　　　　┃
 * -------------------------//┃　　　━　　　┃
 * -------------------------//┃　┳┛　┗┳　┃
 * -------------------------//┃　　　　　　　┃
 * -------------------------//┃　　　┻　　　┃
 * -------------------------//┃　　　　　　　┃
 * -------------------------//┗━┓　　　┏━┛
 * -------------------------//┃　　　┃  神兽保佑
 * -------------------------//┃　　　┃  代码无BUG！
 * -------------------------//┃　　　┗━━━┓
 * -------------------------//┃　　　　　　　┣┓
 * -------------------------//┃　　　　　　　┏┛
 * -------------------------//┗┓┓┏━┳┓┏┛
 * -------------------------// ┃┫┫　┃┫┫
 * -------------------------// ┗┻┛　┗┻┛
 */

public class BaseRecyleAdapter extends RecyclerView.Adapter<BaseRecyleAdapter.ViewHolder> {
    public List<?> data;
    int layout;
    int varid;

    public BaseRecyleAdapter(List<?> data, int layout, int varid) {
        this.data = data;
        this.layout = layout;
        this.varid = varid;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        ViewDataBinding inflate = DataBindingUtil.inflate(from, viewType, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public int getItemViewType(int position) {
        return layout;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.dataBinding.setVariable(varid, data.get(position));
    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding dataBinding;

        public ViewHolder(ViewDataBinding itemView) {
            super(itemView.getRoot());
            this.dataBinding = itemView;
        }
    }
}
