package com.example.creational.abstractfactory.factories;

import com.example.creational.abstractfactory.products.Chair;
import com.example.creational.abstractfactory.products.CoffeeTable;
import com.example.creational.abstractfactory.products.Sofa;
import com.example.creational.abstractfactory.products.chairs.ModernChair;
import com.example.creational.abstractfactory.products.coffeetables.ModernCoffeeTable;
import com.example.creational.abstractfactory.products.sofas.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
    
}
