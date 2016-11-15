package com.coderoom1401.autovalueuserguide.net;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * Created by wangjingyuan on 16/11/15.
 */
@GsonTypeAdapterFactory
public abstract class SampleTypeAdapterFactory implements TypeAdapterFactory {
    public static SampleTypeAdapterFactory create() {
        return new AutoValueGson_SampleTypeAdapterFactory();
    }
}
