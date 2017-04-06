package com.liuyu.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/6.
 */
public class City extends DataSupport {

    private int id;
    /**记录市的名字**/
    private String cityname;
    /**记录市的代号**/
    private int cityCode;
    /**记录当前市所属省的id号**/
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
