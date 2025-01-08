package com.example.creational.builder.models.manuals;

import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.engines.SedanCarEngine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.HeavyFeaturedTripComputer;
import com.example.creational.builder.models.generic.tripcomputers.LessFeaturedTripComputer;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public class SedanCarManual extends Manual{

    @Override
    public void setSeats(int seats) {
        if(seats > 4){
            throw new RuntimeException("Sedan car cannot have seats greater than 4");
        }
        this.seats = seats;
    }

    
    @Override
    public void setEngine(Engine engine) {
        if(!(engine instanceof SedanCarEngine)){
            throw new RuntimeException("Cannot set engine other than Sedan Car engine");
        }
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        if(!(tripComputer instanceof HeavyFeaturedTripComputer)){
            throw new RuntimeException("Cannot set engine other than Heavy featured trip computer");
        }
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGps(Gps gps) {
        if(!(gps instanceof LessFeaturedTripComputer)){
            throw new RuntimeException("Cannot set engine other than Minimal feature gps");
        }
        this.gps = gps;
    }

    @Override
    public String toString(){
        return "SedanCarManual{" +
            "seats=" + seats +
            ", engine=" + engine +
            ", tripComputer=" + tripComputer +
            ", gps=" + gps +
            '}';
    }
    
}