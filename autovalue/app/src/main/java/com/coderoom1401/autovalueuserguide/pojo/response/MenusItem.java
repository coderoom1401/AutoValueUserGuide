package com.coderoom1401.autovalueuserguide.pojo.response;

import java.util.List;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class MenusItem{

	@SerializedName("date")
	public abstract String date();

	@SerializedName("holidayDesc")
	public abstract Object holidayDesc();

	@SerializedName("holdayPic")
	public abstract Object holdayPic();

	@SerializedName("options")
	public abstract List<OptionsItem> options();

	@SerializedName("sellingDate")
	public abstract long sellingDate();

	@SerializedName("day")
	public abstract String day();

	@SerializedName("holiday")
	public abstract boolean holiday();

	@SerializedName("timeout")
	public abstract boolean timeout();

	@SerializedName("hasSelected")
	public abstract boolean hasSelected();

	public static TypeAdapter<MenusItem> typeAdapter(Gson gson) {
		return new AutoValue_MenusItem.GsonTypeAdapter(gson);
	}
}