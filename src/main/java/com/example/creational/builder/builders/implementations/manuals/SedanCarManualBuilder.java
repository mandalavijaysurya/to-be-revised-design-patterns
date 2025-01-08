package com.example.creational.builder.builders.implementations.manuals;

import com.example.creational.builder.builders.CarManualBuilder;
import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;
import com.example.creational.builder.models.manuals.Manual;
import com.example.creational.builder.models.manuals.SedanCarManual;

public class SedanCarManualBuilder implements CarManualBuilder{

    private SedanCarManual sedanCarManual;
    
    public SedanCarManualBuilder(){
        this.sedanCarManual = new SedanCarManual();
    }
    @Override
    public void reset() {
        this.sedanCarManual = new SedanCarManual();
    }

    @Override
    public void setSeats(int seats) {
        this.sedanCarManual.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.sedanCarManual.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.sedanCarManual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(Gps gps) {
        this.sedanCarManual.setGps(gps);
    }

    @Override
    public Manual getResult() {
        return this.sedanCarManual;
    }
    
}
