package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("location")
    public String countyName;
    @SerializedName("cid")
    public String weatherId;

}
