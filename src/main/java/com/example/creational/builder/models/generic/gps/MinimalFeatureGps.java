package com.example.creational.builder.models.generic.gps;

public class MinimalFeatureGps implements Gps{

    @Override
    public void accuracy() {
        System.out.println("Low accuracy and less cost");
    }
    
    @Override
    public String toString(){
        return "MinimalFeatureGps";
    }
}
