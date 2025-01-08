package com.example.creational.builder;


import com.example.creational.builder.builders.implementations.cars.SUVCarBuilder;
import com.example.creational.builder.builders.implementations.manuals.SUVCarManualBuilder;
import com.example.creational.builder.directors.Director;
import com.example.creational.builder.models.cars.Car;
import com.example.creational.builder.models.manuals.Manual;
import com.example.creational.builder.builders.CarBuilder;
import com.example.creational.builder.builders.CarManualBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new SUVCarBuilder();
        CarManualBuilder carManualBuilder = new SUVCarManualBuilder();

        director.makeSUV(carBuilder);

        Car suvCar = carBuilder.getResult();
        System.out.println(suvCar);

        director.makeSUV(carManualBuilder);

        Manual carManual = carManualBuilder.getResult();
        System.out.println(carManual);
    }
}
