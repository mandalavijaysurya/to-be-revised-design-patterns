package com.example.creational.builder.builders;

import com.example.creational.builder.models.generic.engines.Engine;
import com.example.creational.builder.models.generic.gps.Gps;
import com.example.creational.builder.models.generic.tripcomputers.TripComputer;

public interface Builder {

    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setGps(Gps gps);

}
