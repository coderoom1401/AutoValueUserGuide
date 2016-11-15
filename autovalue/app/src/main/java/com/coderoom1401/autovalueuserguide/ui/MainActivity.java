package com.coderoom1401.autovalueuserguide.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.coderoom1401.autovalueuserguide.net.RestApi;
import com.coderoom1401.autovalueuserguide.net.RetrofitFactory;
import com.coderoom1401.autovalueuserguide.pojo.WebResponse;
import com.coderoom1401.autovalueuserguide.pojo.request.DishRequest;
import com.coderoom1401.autovalueuserguide.pojo.response.Data;
import com.coderoom1401.autovalueuserguide.util.LogUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by wangjingyuan on 16/11/14.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Call<WebResponse<Data>> call = RetrofitFactory.getRetrofit().create(RestApi.class).getDish(new DishRequest("eef2c6221c55b572c5aef5611ade1a22"));
        call.enqueue(new Callback<WebResponse<Data>>() {
            @Override
            public void onResponse(Call<WebResponse<Data>> call, Response<WebResponse<Data>> response) {
                LogUtil.i(response.body().toString());
            }

            @Override
            public void onFailure(Call<WebResponse<Data>> call, Throwable t) {

            }
        });
    }
}
