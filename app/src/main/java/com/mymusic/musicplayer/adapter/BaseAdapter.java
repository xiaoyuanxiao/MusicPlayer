package com.mymusic.musicplayer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
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

public abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public List<T> data;

    public BaseAdapter(List<T> data) {
        this.data = data;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        Class<VH> vhClass = vhClass();
        VH tTH = null;
        Constructor c1 = null;
        try {
            c1 = vhClass.getDeclaredConstructor(new Class[]{View.class});
            c1.setAccessible(true);
            View inflate = View.inflate(parent.getContext(), initLayoutId(), null);
            tTH = (VH) c1.newInstance(inflate);
        } catch (Exception e) {
            System.out.println("反射泛型失败");
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
