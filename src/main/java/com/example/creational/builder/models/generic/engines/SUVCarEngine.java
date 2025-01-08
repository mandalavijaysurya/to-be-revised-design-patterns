package com.example.creational.builder.models.generic.engines;

public class SUVCarEngine implements Engine{

    @Override
    public void getRpm() {
        System.out.println("My RPM is low, but I produce much torque");
    }
    
    @Override
    public String toString(){
        return "SUVCarEngine with very high torque";
    }
}
