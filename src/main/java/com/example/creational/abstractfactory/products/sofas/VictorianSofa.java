package com.example.creational.abstractfactory.products.sofas;

import com.example.creational.abstractfactory.products.Sofa;

public class VictorianSofa implements Sofa {
    
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa");
    }
}
