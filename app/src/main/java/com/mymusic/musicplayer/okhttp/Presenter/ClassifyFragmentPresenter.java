package com.mymusic.musicplayer.okhttp.Presenter;

import com.mymusic.musicplayer.bean.ClassifyBean;
import com.mymusic.musicplayer.okhttp.Factory.IBizFactory;
import com.mymusic.musicplayer.okhttp.Iview.IClassifyFragmentView;
import com.mymusic.musicplayer.okhttp.Moudle.IClassifyFragmentBiz;
import com.mymusic.musicplayer.okhttp.oncallback.ClassifyFragmentListener;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public class ClassifyFragmentPresenter {
    IClassifyFragmentBiz iClassifyFragmentBiz;
    IClassifyFragmentView iClassifyFragmentView;

    public ClassifyFragmentPresenter(IClassifyFragmentView iClassifyFragmentView) {
        iClassifyFragmentBiz = IBizFactory.getClassifyFragmentBiz();
        this.iClassifyFragmentView = iClassifyFragmentView;
    }

    public void getdata() {
        iClassifyFragmentBiz.getdata(new ClassifyFragmentListener() {
            @Override
            public void onSuccess(ClassifyBean classifyBean) {
                List<ClassifyBean.LabelsBean> labels = classifyBean.getLabels();
                List<ClassifyBean.StandardTypesBean> standard_types = classifyBean.getStandard_types();
                iClassifyFragmentView.setClassifyLabels(labels);
                iClassifyFragmentView.setClassifyStandardtypes(standard_types);

            }

            @Override
            public void onFailure(String code) {

            }
        });
    }

}
