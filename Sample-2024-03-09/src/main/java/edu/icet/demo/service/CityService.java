package edu.icet.demo.service;

import java.util.HashMap;

public class CityService {

    public String getCityByPostalCode(String postalCode){
        HashMap<String,String> cityList = new HashMap();
        cityList.put("1001","Colombo");
        cityList.put("1002","Kaluthara");
        cityList.put("1003","Gampaha");

        return cityList.get(postalCode);
    }
}
