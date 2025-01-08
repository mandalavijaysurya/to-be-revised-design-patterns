package com.example.creational.builder.builders.implementations.cars;

import com.example.creational.builder.builders.CarBuilder;
import com.example.creational.builder.models.cars.Car;
import com.example.creational.builder.models.cars.SportsCar;
import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public class SportsCarBuilder implements CarBuilder{

    private SportsCar sportsCar;

    public SportsCarBuilder(){
        this.sportsCar = new SportsCar();
    }
    @Override
    public void reset() {
        this.sportsCar = new SportsCar();
    }

    @Override
    public void setSeats(int seats) {
        this.sportsCar.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.sportsCar.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.sportsCar.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(Gps gps) {
        this.setGps(gps);
    }

    @Override
    public Car getResult() {
        return this.sportsCar;
    }
    
}
