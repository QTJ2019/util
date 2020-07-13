package com.jian.entity;

/**
 * @Author: qtj
 * @Date: 2020/7/1 14:24
 * @Version
 */
public class Address {

    private String province;
    private String city;

    @Override
    public String toString() {
        return "{ province:" + province + "\ncity:"+city + "}" ;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
