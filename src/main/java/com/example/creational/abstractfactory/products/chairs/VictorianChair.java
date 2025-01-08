package com.example.creational.abstractfactory.products.chairs;

import com.example.creational.abstractfactory.products.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
    
}
