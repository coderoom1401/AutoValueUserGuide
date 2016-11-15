package com.coderoom1401.autovalueuserguide.pojo.response;

import java.util.List;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class Data{

	@SerializedName("currentTime")
	public abstract long currentTime();

	@SerializedName("buildingName")
	public abstract String buildingName();

	@SerializedName("tomorrowBookTimeLimit")
	public abstract TomorrowBookTimeLimit tomorrowBookTimeLimit();

	@SerializedName("menus")
	public abstract List<MenusItem> menus();

	@SerializedName("cityId")
	public abstract int cityId();

	@SerializedName("isNewUser")
	public abstract boolean isNewUser();

	public static TypeAdapter<Data> typeAdapter(Gson gson) {
		return new AutoValue_Data.GsonTypeAdapter(gson);
	}
}