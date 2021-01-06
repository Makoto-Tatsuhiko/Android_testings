package com.example.androidassignment1;

public class MyWagashiData {

    private String wagashiName;
    private String wagashiLocation;
    private Integer wagashiImage;

    public MyWagashiData(String wagashiName, String wagashiLocation, Integer wagashiImage) {
        this.wagashiName = wagashiName;
        this.wagashiLocation = wagashiLocation;
        this.wagashiImage = wagashiImage;
    }

    public String getWagashiName() {
        return wagashiName;
    }

    public void setWagashiName(String wagashiName) {
        this.wagashiName = wagashiName;
    }

    public String getWagashiLocation() {
        return wagashiLocation;
    }

    public void setWagashiLocation(String wagashiLocation) {
        this.wagashiLocation = wagashiLocation;
    }

    public Integer getWagashiImage() {
        return wagashiImage;
    }

    public void setWagashiImage(Integer wagashiImage) {
        this.wagashiImage = wagashiImage;
    }



}
