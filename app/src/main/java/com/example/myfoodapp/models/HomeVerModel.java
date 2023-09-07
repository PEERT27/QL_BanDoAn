package com.example.myfoodapp.models;

public class HomeVerModel {
    int image;
    String name;
    String time;
    String racking;
    String price;

    public HomeVerModel(int image, String name, String time, String racking, String price) {

        this.image = image;
        this.name = name;
        this.time = time;
        this.racking = racking;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRacking() {
        return racking;
    }

    public void setRacking(String racking) {
        this.racking = racking;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
