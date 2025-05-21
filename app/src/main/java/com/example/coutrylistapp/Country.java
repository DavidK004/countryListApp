package com.example.coutrylistapp;

public class Country {
    int nameResId;
    int capitalResId;
    int descResId;
    int imageResId;

    public Country(int nameResId, int capitalResId, int descResId, int imageResId){
        this.capitalResId = capitalResId;
        this.descResId = descResId;
        this.nameResId = nameResId;
        this.imageResId = imageResId;
    }
}
