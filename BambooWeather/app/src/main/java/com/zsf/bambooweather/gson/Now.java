package com.zsf.bambooweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zsf on 2017/5/11.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }




}
