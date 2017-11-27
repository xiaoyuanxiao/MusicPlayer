package com.mymusic.musicplayer.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.okhttp.Iview.IClassifyFragmentView;
import com.mymusic.musicplayer.utils.DynamicTimeFormat;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class ClassifyFragment extends BaseFragment implements IClassifyFragmentView {
    private GridLayoutManager LayoutManager;
    private RefreshLayout mRefreshLayout;
    private RecyclerView recyclerView;
    private ClassicsHeader mClassicsHeader;


    public static ClassifyFragment newInstance() {
        ClassifyFragment classifyFragment = new ClassifyFragment();
        return classifyFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_classify, null);
        mRefreshLayout = (RefreshLayout) inflate.findViewById(R.id.refreshLayout);
        recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        mClassicsHeader = (ClassicsHeader) mRefreshLayout.getRefreshHeader();

        mClassicsHeader.setTimeFormat(new DynamicTimeFormat("最后更新 %s"));
        mRefreshLayout.autoRefresh();


        LayoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(LayoutManager);
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void setClassifyLabels(List<ClassifyBean.LabelsBean> labelsBeen) {
        // MultipleItem topEnter = new MultipleItem();
    }

    @Override
    public void setClassifyStandardtypes(List<ClassifyBean.StandardTypesBean> standardtypes) {

    }
}
