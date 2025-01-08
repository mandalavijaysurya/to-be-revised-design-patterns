package com.example.creational.abstractfactory;

import com.example.creational.abstractfactory.factories.ArtDecorFurnitureFactory;
import com.example.creational.abstractfactory.factories.FurnitureFactory;
import com.example.creational.abstractfactory.factories.ModernFurnitureFactory;
import com.example.creational.abstractfactory.factories.VictorianFurnitureFactory;

public class FurnitureFactoryFactory {
    public static FurnitureFactory getFactory(DesignType designType) {
        switch (designType) {
            case VICTORIAN:
                return new VictorianFurnitureFactory();
            case ARTDECOR:
                return new ArtDecorFurnitureFactory();
            case MODERN:
                return new ModernFurnitureFactory();
            default:
                throw new UnsupportedOperationException("This material is unsupported");
        }
    }
}
