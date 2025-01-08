package com.example.creational.builder.builders.implementations.manuals;

import com.example.creational.builder.builders.CarManualBuilder;
import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;
import com.example.creational.builder.models.manuals.Manual;
import com.example.creational.builder.models.manuals.SportsCarManual;

public class SportsCarManualBuilder implements CarManualBuilder{

    private SportsCarManual sportsCarManual;
    
    public SportsCarManualBuilder(){
        this.sportsCarManual = new SportsCarManual();
    }
    @Override
    public void reset() {
        this.sportsCarManual = new SportsCarManual();
    }

    @Override
    public void setSeats(int seats) {
        this.sportsCarManual.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.sportsCarManual.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.sportsCarManual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(Gps gps) {
        this.sportsCarManual.setGps(gps);
    }

    @Override
    public Manual getResult() {
        return this.sportsCarManual;
    }
    
}
