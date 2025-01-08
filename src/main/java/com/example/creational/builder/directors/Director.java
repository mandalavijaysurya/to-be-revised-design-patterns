package com.example.creational.builder.directors;

import com.example.creational.builder.builders.Builder;
import com.example.creational.builder.models.generic.engines.SUVCarEngine;
import com.example.creational.builder.models.generic.engines.SedanCarEngine;
import com.example.creational.builder.models.generic.engines.SportsCarEngine;
import com.example.creational.builder.models.generic.gps.HeavyFeatureGps;
import com.example.creational.builder.models.generic.tripcomputers.HeavyFeaturedTripComputer;

public class Director {

    public void makeSUV(Builder builder) {
        builder.setSeats(6);
        builder.setEngine(new SUVCarEngine());
        builder.setGps(new HeavyFeatureGps());
        builder.setTripComputer(new HeavyFeaturedTripComputer());
    }

    public void makeSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new SportsCarEngine());
        builder.setGps(new HeavyFeatureGps());
        builder.setTripComputer(new HeavyFeaturedTripComputer());
    }

    public void makeSedanCar(Builder builder) {
        builder.setSeats(4);
        builder.setEngine(new SedanCarEngine());
        builder.setGps(new HeavyFeatureGps());
        builder.setTripComputer(new HeavyFeaturedTripComputer());
    }
}
