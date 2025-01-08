package com.example.creational.builder.models.generic.engines;

public class SportsCarEngine implements Engine{
    
    @Override
    public void getRpm(){
        System.out.println("My RPM is very high");
    }

    @Override
    public String toString(){
        return "SportsCarEngine with very high RPM";
    }
}
