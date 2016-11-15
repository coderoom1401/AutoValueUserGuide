package com.coderoom1401.autovalueuserguide.pojo;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

/**
 * Created by wangjingyuan on 16/11/14.
 */

@AutoValue
public abstract class WebResponse<T> implements IPojo {
    @SerializedName("status")
    public abstract String tatus();

    @SerializedName("data")
    public abstract T data();

    public static <T> TypeAdapter<WebResponse<T>> typeAdapter(Gson gson, TypeToken<? extends WebResponse<T>> typeToken) {
        return new AutoValue_WebResponse.GsonTypeAdapter(gson, typeToken);
    }
}
