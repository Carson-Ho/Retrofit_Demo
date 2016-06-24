package com.example.carson_ho.retrofit_demo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Carson_Ho on 16/6/24.
 */
public interface AccessApi {
    //表示采用Get方法发送网络请求
    @GET("openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q=car")
    //getCall()是接受网络请求数据的方法
    // 其中返回类型为Call<*>,参数是接受数据的JavaBean
    Call<Translation> getCall();
}

