package com.example.creational.builder.builders.implementations.cars;

import com.example.creational.builder.builders.CarBuilder;
import com.example.creational.builder.models.cars.Car;
import com.example.creational.builder.models.cars.SedanCar;
import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public class SedanCarBuilder implements CarBuilder{

    public SedanCar sedanCar;

    public SedanCarBuilder(){
        this.sedanCar = new SedanCar();
    }
    @Override
    public void reset() {
        this.sedanCar = new SedanCar();
    }

    @Override
    public void setSeats(int seats) {
        this.sedanCar.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.sedanCar.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.sedanCar.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(Gps gps) {
        this.sedanCar.setGps(gps);
    }

    @Override
    public Car getResult() {
        return this.sedanCar;
    }
    
}
