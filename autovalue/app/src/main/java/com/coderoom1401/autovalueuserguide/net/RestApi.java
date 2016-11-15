package com.coderoom1401.autovalueuserguide.net;

import com.coderoom1401.autovalueuserguide.pojo.WebResponse;
import com.coderoom1401.autovalueuserguide.pojo.request.DishRequest;
import com.coderoom1401.autovalueuserguide.pojo.response.Data;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by wangjingyuan on 16/11/14.
 */

public interface RestApi {
    @POST("/api/dishNew")
    Call<WebResponse<Data>> getDish(@Body DishRequest dishRequest);
}
