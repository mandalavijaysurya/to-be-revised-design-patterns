package com.example.creational.builder.builders.implementations.cars;

import com.example.creational.builder.builders.CarBuilder;
import com.example.creational.builder.models.cars.Car;
import com.example.creational.builder.models.cars.SUVCar;
import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public class SUVCarBuilder implements CarBuilder {

    private SUVCar suvCar;

    public SUVCarBuilder(){
        this.suvCar = new SUVCar();
    }
    @Override
    public void reset() {
        this.suvCar = new SUVCar();
    }

    @Override
    public void setSeats(int seats) {
        this.suvCar.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.suvCar.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.suvCar.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(Gps gps) {
        this.suvCar.setGps(gps);
    }

    @Override
    public Car getResult() {
        return this.suvCar;
    }
    
}
