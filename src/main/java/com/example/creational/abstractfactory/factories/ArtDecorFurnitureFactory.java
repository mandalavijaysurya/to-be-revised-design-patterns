package com.example.creational.abstractfactory.factories;

import com.example.creational.abstractfactory.products.Chair;
import com.example.creational.abstractfactory.products.CoffeeTable;
import com.example.creational.abstractfactory.products.Sofa;
import com.example.creational.abstractfactory.products.chairs.ArtDecorChair;
import com.example.creational.abstractfactory.products.coffeetables.ArtDecorCoffeeTable;
import com.example.creational.abstractfactory.products.sofas.ArtDecorSofa;

public class ArtDecorFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecorChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecorSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecorCoffeeTable();
    }
    
}
