package com.example.creational.abstractfactory.factories;

import com.example.creational.abstractfactory.products.Chair;
import com.example.creational.abstractfactory.products.CoffeeTable;
import com.example.creational.abstractfactory.products.Sofa;
import com.example.creational.abstractfactory.products.chairs.VictorianChair;
import com.example.creational.abstractfactory.products.coffeetables.VictorianCoffeeTable;
import com.example.creational.abstractfactory.products.sofas.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
    
}
