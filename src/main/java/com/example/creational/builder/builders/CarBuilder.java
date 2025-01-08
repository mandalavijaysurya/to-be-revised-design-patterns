package com.example.creational.builder.builders;

import com.example.creational.builder.models.cars.Car;

public interface CarBuilder extends Builder {

    public Car getResult();

}   
