package com.example.creational.builder.models.manuals;

import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public abstract class Manual {
    protected int seats;
    protected Engine engine;
    protected TripComputer tripComputer;
    protected Gps gps;

    public int getSeats() {
        return seats;
    }
    public Engine getEngine() {
        return engine;
    }
    public TripComputer getTripComputer() {
        return tripComputer;
    }
    public Gps getGps() {
        return gps;
    }

    public abstract void setSeats(int seats);
    public abstract void setEngine(Engine engine);
    public abstract void setTripComputer(TripComputer tripComputer);
    public abstract void setGps(Gps setGps);
}
