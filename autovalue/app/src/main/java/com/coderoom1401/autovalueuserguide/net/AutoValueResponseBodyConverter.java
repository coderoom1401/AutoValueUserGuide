package com.coderoom1401.autovalueuserguide.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by wangjingyuan on 16/11/15.
 */

final class AutoValueResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    @Override
    public T convert(ResponseBody value) throws IOException {
        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(SampleTypeAdapterFactory.create())
                .create();
        Type responseType = new TypeToken<T>() {
        }.getType();
        return gson.fromJson(value.string(), responseType);
    }
}
