package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Air {
    @SerializedName("air_now_city")
    public AirCity city;

    private class AirCity {
        public String aqi;
        public String pm10;
        @SerializedName("qlty")
        public String airQuality;
    }
}
