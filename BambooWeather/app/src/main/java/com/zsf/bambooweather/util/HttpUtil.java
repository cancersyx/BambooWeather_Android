package com.zsf.bambooweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zsf on 2017/5/6.
 * 网络请求工具类
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }


}
