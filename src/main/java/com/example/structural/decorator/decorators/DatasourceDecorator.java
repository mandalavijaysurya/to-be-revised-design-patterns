package com.example.structural.decorator.decorators;

import com.example.structural.decorator.components.Datasource;

public class DatasourceDecorator implements Datasource{

    private Datasource wrappee;

    public DatasourceDecorator(Datasource source){
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return this.wrappee.readData();
    }
    
}
