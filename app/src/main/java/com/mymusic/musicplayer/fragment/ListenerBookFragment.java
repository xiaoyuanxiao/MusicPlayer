package com.mymusic.musicplayer.fragment;

import android.view.View;

import com.google.gson.Gson;
import com.mymusic.musicplayer.R;
import com.mymusic.musicplayer.bean.RecommendationBean;
import com.mymusic.musicplayer.view.GlideImageLoader;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.youth.banner.Banner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoyu on 2017/11/15.
 */

public class ListenerBookFragment extends BaseFragment {
    private List images = new ArrayList<>();
    private Banner banner;
    List<RecommendationBean.CarouselsBean> carousels;
    final Gson gson = new Gson();

    public static ListenerBookFragment newInstance() {
        ListenerBookFragment listenerBookFragment = new ListenerBookFragment();
        return listenerBookFragment;
    }

    @Override
    View initView() {
        View inflate = View.inflate(getContext(), R.layout.fragment_listenerbook, null);
        banner = (Banner) inflate.findViewById(R.id.banner);
        return inflate;
    }

    @Override
    protected void initData() {
        super.initData();
        getdata();
    }

    //    private void getdata() {
//        OkHttpClient mOkHttpClient = new OkHttpClient();
//        FormEncodingBuilder builder = new FormEncodingBuilder();
//        builder.add("username", "okhttp");//有几个参数add几个
//        Request request = new Request.Builder()
//                .url("url地址")
//                .post(builder.build())
//                .build();
//
//        mOkHttpClient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Request request, IOException e) {
//            }
//
//            @Override
//            public void onResponse(Response response) throws IOException {
//                Log.e("Post---response", response + "");
//                //与get请求一样，若涉及到回调主线程，都需要写runOnUiThread
//            }
//        });
//    }


    private void getdata() {
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder().url("https://baiting.longruncloud.com/api/recommendations").build();
        //请求加入调度,异步的方式执行请求
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                /**
                 * 这里成功代表的是http返回成功，也就是若返回404、405之类的错误也会回调到这里，所以我们需要自己判断服务端返回码
                 * 一般返回200是成功处理了请求
                 */
                if (response.code() == 200) {
                    final String res = response.body().string();
                    RecommendationBean recommendationBean = gson.fromJson(res, RecommendationBean.class);
                    carousels = recommendationBean.getCarousels();
                    /**
                     * 因为Android 的网络请求必须在非主线程，而视图的更新必须在主线程
                     * 所以必须有子线程回调主线程这样一个操作，而okhttp没有添加任何关于Android的代码
                     * 也就是没有添加其他的包，这样可以使得okhttp可以应用于任何地点而单独存在
                     * 但是在Android中就变成必须要自己去实现子线程到主线程的回调
                     * 也就是在执行异步请求之后，得到数据时我们又要使用runOnUiThread更新主线程(设置界面)
                     */
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            //增强for循环添加图片路径
                            for (RecommendationBean.CarouselsBean element : carousels) {
                                String image = element.getImage();
                                images.add(image);
                            }
                            //Banner图片加载，支持手势滑动，支持首尾循环
                            banner.setImageLoader(new GlideImageLoader());
                            // 设置图片集合
                            banner.setImages(images);
                            //banner设置方法全部调用完毕时最后调用
                            banner.start();
                        }
                    });
                }
            }
        });
    }

    @Override
    protected void setOnclick() {

    }

    @Override
    public void onClick(View view) {

    }
}