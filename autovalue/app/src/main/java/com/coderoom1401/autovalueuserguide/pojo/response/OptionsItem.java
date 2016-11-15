package com.coderoom1401.autovalueuserguide.pojo.response;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class OptionsItem{

	@SerializedName("discounted")
	public abstract double discounted();

	@SerializedName("dishSummary")
	public abstract String dishSummary();

	@SerializedName("dishCategory")
	public abstract int dishCategory();

	@SerializedName("img")
	public abstract String img();

	@SerializedName("labelText")
	public abstract String labelText();

	@SerializedName("rating")
	public abstract double rating();

	@SerializedName("activityTime")
	public abstract long activityTime();

	@SerializedName("noStock")
	public abstract boolean noStock();

	@SerializedName("recommend")
	public abstract int recommend();

	@SerializedName("threshold")
	public abstract Object threshold();

	@SerializedName("isNew")
	public abstract boolean isNew();

	@SerializedName("saleNum")
	public abstract int saleNum();

	@SerializedName("labelColor")
	public abstract String labelColor();

	@SerializedName("activityId")
	public abstract int activityId();

	@SerializedName("preferential")
	public abstract boolean preferential();

	@SerializedName("dishPictureUrl")
	public abstract String dishPictureUrl();

	@SerializedName("restaurantName")
	public abstract String restaurantName();

	@SerializedName("price")
	public abstract double price();

	@SerializedName("dishId")
	public abstract int dishId();

	@SerializedName("name")
	public abstract String name();

	@SerializedName("dishStockId")
	public abstract int dishStockId();

	@SerializedName("id")
	public abstract int id();

	@SerializedName("desc")
	public abstract String desc();

	@SerializedName("order")
	public abstract double order();

	public static TypeAdapter<OptionsItem> typeAdapter(Gson gson) {
		return new AutoValue_OptionsItem.GsonTypeAdapter(gson);
	}
}