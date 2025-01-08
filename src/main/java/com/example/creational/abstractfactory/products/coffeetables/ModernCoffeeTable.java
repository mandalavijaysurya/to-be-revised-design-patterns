package com.example.creational.abstractfactory.products.coffeetables;

import com.example.creational.abstractfactory.products.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    
    @Override
    public void putCoffeeOn() {
        System.out.println("You put coffee on a Modern coffee table.");
    }
}
