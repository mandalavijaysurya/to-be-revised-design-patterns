package com.example.creational.builder.models.generic.tripcomputers;

public class LessFeaturedTripComputer implements TripComputer{

    @Override
    public void functionality() {
        System.out.println("Analog Trip Computer");
    }

    @Override
    public String toString(){
        return "LessFeaturedTripComputer";
    } 
    
}
