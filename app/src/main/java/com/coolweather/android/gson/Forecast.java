package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    @SerializedName("cond_txt_d")
    public String dayWeather;
    @SerializedName("cond_txt_n")
    public String nightWeather;
    public String date;
    public String tmp_max;
    public String tmp_min;
}
