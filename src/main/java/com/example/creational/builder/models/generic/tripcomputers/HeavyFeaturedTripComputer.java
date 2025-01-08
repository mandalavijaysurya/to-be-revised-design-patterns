package com.example.creational.builder.models.generic.tripcomputers;

public class HeavyFeaturedTripComputer implements TripComputer{

    @Override
    public void functionality() {
        System.out.println("Digital Trip Computer");
    }

    @Override
    public String toString(){
        return "HeavyFeaturedTripComputer";
    }
    
}
