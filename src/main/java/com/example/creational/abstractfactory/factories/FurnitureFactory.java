package com.example.creational.abstractfactory.factories;

import com.example.creational.abstractfactory.products.Chair;
import com.example.creational.abstractfactory.products.CoffeeTable;
import com.example.creational.abstractfactory.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable(); 
}
