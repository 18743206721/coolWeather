package com.liuyu.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/6.
 */
public class County extends DataSupport {

    private int id;
    /**记录县的名字**/
    private String countyName;
    /**记录县所对应的id**/
    private String weatherId;
    /**记录当前县所属市的id*/
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
