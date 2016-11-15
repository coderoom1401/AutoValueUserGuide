package com.coderoom1401.autovalueuserguide.pojo.response;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class TomorrowBookTimeLimit{

	@SerializedName("countdownTimeScope")
	public abstract String countdownTimeScope();

	@SerializedName("prohibitedSince")
	public abstract String prohibitedSince();

	public static TypeAdapter<TomorrowBookTimeLimit> typeAdapter(Gson gson) {
		return new AutoValue_TomorrowBookTimeLimit.GsonTypeAdapter(gson);
	}
}