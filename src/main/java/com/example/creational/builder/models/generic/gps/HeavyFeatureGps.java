package com.example.creational.builder.models.generic.gps;

public class HeavyFeatureGps implements Gps{

    @Override
    public void accuracy() {
        System.out.println("Heavy featured, high accuracy and costly");
    }
    
    @Override
    public String toString(){
        return "HeavyFeatureGps";
    }
}
