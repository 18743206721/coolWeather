package com.liuyu.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/7.
 */
public class Basic {

    @SerializedName("city")  //用注解的方式来让Json字段和java字段，之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update  update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }



}
