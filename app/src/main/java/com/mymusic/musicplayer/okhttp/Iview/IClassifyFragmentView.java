package com.mymusic.musicplayer.okhttp.Iview;

import com.mymusic.musicplayer.bean.ClassifyBean;

import java.util.List;

/**
 * Created by xiaoyu on 2017/11/27.
 */

public interface IClassifyFragmentView {
    void setClassifyLabels(List<ClassifyBean.LabelsBean> labelsBeen);

    void setClassifyStandardtypes(List<ClassifyBean.StandardTypesBean> standardtypes);


}
