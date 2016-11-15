package com.coderoom1401.autovalueuserguide.net;

import com.coderoom1401.autovalueuserguide.util.LogUtil;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/**
 * Created by wangjingyuan on 16/11/14.
 */

public class RetrofitFactory {
    public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .client(initOkHttpClient())
                .addConverterFactory(AutoValueConverterFactory.create())
                .baseUrl("https://zaocan.ele.me")
                .build();
    }

    private static OkHttpClient initOkHttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(String message) {
                        LogUtil.i(message);
                    }
                }).setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
    }
}
