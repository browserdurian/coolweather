package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private String proviceName;
    private int provinceCode;
    private int id;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setProviceName(String proviceName){
        this.proviceName = proviceName;
    }
    public String getProviceName() {
        return proviceName;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
}
