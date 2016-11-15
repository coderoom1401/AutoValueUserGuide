package com.coderoom1401.autovalueuserguide.pojo.response;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class Dish{

	@SerializedName("data")
	public abstract Data data();

	@SerializedName("message")
	public abstract Object message();

	@SerializedName("status")
	public abstract String status();

	public static TypeAdapter<Dish> typeAdapter(Gson gson) {
		return new AutoValue_Dish.GsonTypeAdapter(gson);
	}
}