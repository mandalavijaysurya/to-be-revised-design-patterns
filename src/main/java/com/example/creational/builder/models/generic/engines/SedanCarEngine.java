package com.example.creational.builder.models.generic.engines;

public class SedanCarEngine implements Engine{

    @Override
    public void getRpm() {
        System.out.println("My RPM is moderate");
    }


    @Override
    public String toString(){
        return "SedanCarEngine with moderate RPM";
    }
    
}
