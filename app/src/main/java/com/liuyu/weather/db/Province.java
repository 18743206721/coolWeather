package com.liuyu.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/6.
 */
public class Province extends DataSupport{

    private int id;
    /**省份的名字**/
    private String provinceName;
    /**省份的代号**/
    private int provinceCode;

    public Province() {
    }

    public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
