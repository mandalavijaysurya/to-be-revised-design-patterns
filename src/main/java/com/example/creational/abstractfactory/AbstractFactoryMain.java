package com.example.creational.abstractfactory;

import com.example.creational.abstractfactory.factories.FurnitureFactory;
import com.example.creational.abstractfactory.products.Chair;
import com.example.creational.abstractfactory.products.CoffeeTable;
import com.example.creational.abstractfactory.products.Sofa;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        // Abstract Factory
        FurnitureFactory furnitureFactory = FurnitureFactoryFactory.getFactory(DesignType.ARTDECOR);
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();

        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffeeOn();
    }
}
