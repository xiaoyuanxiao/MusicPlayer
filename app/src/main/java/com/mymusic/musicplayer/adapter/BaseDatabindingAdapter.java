package com.mymusic.musicplayer.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.lang.reflect.Constructor;
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

public abstract class BaseDatabindingAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public List<T> data;

    public BaseDatabindingAdapter(List<T> data) {
        this.data = data;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Class<VH> vhClass = vhClass();
        VH tTH = null;
        Constructor c1 = null;
        try {
            //帮我注释下 我要去写博客的
            c1 = vhClass.getDeclaredConstructor(new Class[]{ViewDataBinding.class});
            c1.setAccessible(true);
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            ViewDataBinding viewDataBinding = DataBindingUtil.inflate(inflater, initLayoutId(), parent, false);
            tTH = (VH) c1.newInstance(viewDataBinding);
        } catch (Exception e) {
            System.out.println("反射泛型失败" + e.getMessage() + "===========" + e);
        }

        return tTH;
    }

    abstract Class<VH> vhClass();

    abstract int initLayoutId();

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        return data.size();
    }
}
