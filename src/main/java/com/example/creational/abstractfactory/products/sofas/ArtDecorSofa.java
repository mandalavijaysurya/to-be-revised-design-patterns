package com.example.creational.abstractfactory.products.sofas;

import com.example.creational.abstractfactory.products.Sofa;

public class ArtDecorSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on an Art Decor sofa");
    }
    
}
