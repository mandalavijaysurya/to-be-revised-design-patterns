package com.example.creational.builder.builders.implementations.manuals;

import com.example.creational.builder.builders.CarManualBuilder;
import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;
import com.example.creational.builder.models.manuals.Manual;
import com.example.creational.builder.models.manuals.SUVCarManual;

public class SUVCarManualBuilder implements CarManualBuilder{

    private SUVCarManual suvCarManual;

    public SUVCarManualBuilder(){
        this.suvCarManual = new SUVCarManual();
    }
    @Override
    public void reset() {
        this.suvCarManual = new SUVCarManual();
    }

    @Override
    public void setSeats(int seats) {
        this.suvCarManual.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.suvCarManual.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.suvCarManual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(Gps gps) {
        this.suvCarManual.setGps(gps);
    }

    @Override
    public Manual getResult() {
        return this.suvCarManual;
    }
    
}
