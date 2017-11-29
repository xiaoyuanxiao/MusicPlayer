package com.mymusic.musicplayer.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.adapter.ClassifyAllAdapter;
import com.mymusic.musicplayer.adapter.ClassifyStandardAdapter;
import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.okhttp.Iview.IClassifyFragmentView;
import com.mymusic.musicplayer.okhttp.Presenter.ClassifyFragmentPresenter;
import com.mymusic.musicplayer.utils.DynamicTimeFormat;
import com.mymusic.musicplayer.view.MyDividerDecoration;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class ListenerBookClassifyFragment extends BaseFragment implements IClassifyFragmentView {
    private GridLayoutManager AllLayoutManager;
    private GridLayoutManager ChineseLayoutManager;
    private GridLayoutManager OtherLayoutManager;
    private RefreshLayout mRefreshLayout;
    private ClassicsHeader mClassicsHeader;
    private RecyclerView rv_classify_all, rv_classify_chinese, rv_classify_otherCountries;
    private ClassifyAllAdapter classifyAllAdapter;
    private List<ClassifyBean.LabelsBean> labelsBeanList;
    private ClassifyStandardAdapter classifyStandardChineseAdapter;
    private ClassifyStandardAdapter classifyStandardOhterAdapter;
    private List<ClassifyBean.StandardTypesBean.LabelsBeanX> standardTypesChineseList;
    private List<ClassifyBean.StandardTypesBean.LabelsBeanX> standardTypesOhterList;


    private ClassifyFragmentPresenter classifyFragmentPresenter = new ClassifyFragmentPresenter(this);
    private TextView tv_classify_one, tv_classify_two;

    MyDividerDecoration myGridRvDividerDecoration;

    public static ListenerBookClassifyFragment newInstance() {
        ListenerBookClassifyFragment classifyFragment = new ListenerBookClassifyFragment();
        return classifyFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getActivity(), R.layout.fg_classify, null);
        mRefreshLayout = (RefreshLayout) inflate.findViewById(R.id.refreshLayout);
        rv_classify_all = (RecyclerView) inflate.findViewById(R.id.rv_classify_all);
        rv_classify_chinese = (RecyclerView) inflate.findViewById(R.id.rv_classify_chinese);
        rv_classify_otherCountries = (RecyclerView) inflate.findViewById(R.id.rv_classify_otherCountries);
        tv_classify_one = (TextView) inflate.findViewById(R.id.tv_classify_one);
        tv_classify_two = (TextView) inflate.findViewById(R.id.tv_classify_two);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        myGridRvDividerDecoration = new MyDividerDecoration(getActivity());
        mClassicsHeader = (ClassicsHeader) mRefreshLayout.getRefreshHeader();
        mClassicsHeader.setTimeFormat(new DynamicTimeFormat("最后更新 %s"));
//        mRefreshLayout.autoRefresh();


        AllLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_classify_all.setLayoutManager(AllLayoutManager);
        labelsBeanList = new ArrayList<>();
        classifyAllAdapter = new ClassifyAllAdapter(labelsBeanList);
        rv_classify_all.setAdapter(classifyAllAdapter);
        rv_classify_all.addItemDecoration(myGridRvDividerDecoration);

        ChineseLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_classify_chinese.setLayoutManager(ChineseLayoutManager);
        standardTypesChineseList = new ArrayList<>();
        classifyStandardChineseAdapter = new ClassifyStandardAdapter(standardTypesChineseList);
        rv_classify_chinese.setAdapter(classifyStandardChineseAdapter);
        rv_classify_chinese.addItemDecoration(myGridRvDividerDecoration);

        OtherLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_classify_otherCountries.setLayoutManager(OtherLayoutManager);
        standardTypesOhterList = new ArrayList<>();
        classifyStandardOhterAdapter = new ClassifyStandardAdapter(standardTypesOhterList);
        rv_classify_otherCountries.setAdapter(classifyStandardOhterAdapter);
        rv_classify_otherCountries.addItemDecoration(myGridRvDividerDecoration);

        classifyFragmentPresenter.getdata();
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void setClassifyLabels(List<ClassifyBean.LabelsBean> labelsBeen) {
        labelsBeanList.clear();
        labelsBeanList.addAll(labelsBeen);
        classifyAllAdapter.notifyDataSetChanged();
    }

    @Override
    public void setClassifyStandardtypes(List<ClassifyBean.StandardTypesBean> standardtypes) {
        List<ClassifyBean.StandardTypesBean.LabelsBeanX> chineseLabels = standardtypes.get(0).getLabels();
        List<ClassifyBean.StandardTypesBean.LabelsBeanX> OhterLabels = standardtypes.get(1).getLabels();
        standardTypesChineseList.clear();
        standardTypesChineseList.addAll(chineseLabels);
        classifyStandardChineseAdapter.notifyDataSetChanged();

        standardTypesOhterList.clear();
        standardTypesOhterList.addAll(OhterLabels);
        classifyStandardOhterAdapter.notifyDataSetChanged();
        tv_classify_one.setText(standardtypes.get(0).getName());
        tv_classify_two.setText(standardtypes.get(1).getName());
    }
}
