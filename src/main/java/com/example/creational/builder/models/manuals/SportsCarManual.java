package com.example.creational.builder.models.manuals;

import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.engines.SportsCarEngine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.gps.HeavyFeatureGps;
import com.example.creational.builder.models.generic.tripcomputers.HeavyFeaturedTripComputer;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public class SportsCarManual extends Manual{

    
    @Override
    public void setSeats(int seats) {
        if(seats > 2){
            throw new RuntimeException("Sports car cannot have seats greater than 2");
        }
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        if(!(engine instanceof SportsCarEngine)){
            throw new RuntimeException("Cannot set engine other than Sports Car engine");
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
        if(!(gps instanceof HeavyFeatureGps)){
            throw new RuntimeException("Cannot set engine other than Heavy feature gps");
        }
        this.gps = gps;
    }
    
    @Override
    public String toString(){
        return "SportsCarManual{" +
            "seats=" + seats +
            ", engine=" + engine +
            ", tripComputer=" + tripComputer +
            ", gps=" + gps +
            '}';
    }

    
}
