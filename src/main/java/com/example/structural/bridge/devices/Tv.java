package com.example.structural.bridge.devices;

public class Tv implements Device {

    private boolean isDeviceEnabled;
    private String name;
    private int volume;
    private int channel;

    public Tv(){

        this.name = "Television";
        this.isDeviceEnabled = false;

    }

    @Override
    public boolean isEnabled() {
        return isDeviceEnabled;
    }

    @Override
    public void enable() {
        
        isDeviceEnabled = true;

    }

    @Override
    public void disable() {
        
        isDeviceEnabled = false;

    }

    @Override
    public int getVolume() {

        return this.volume;

    }

    @Override
    public void setVolume(int percent) {

        this.volume = percent;

    }

    @Override
    public int getChannel() {
        
        return this.channel;

    }

    @Override
    public void setChannel(int channel) {

        this.channel = channel;

    }

    @Override
    public String getName() {
        
        return this.name;

    }

    @Override
    public DeviceStatus getDeviceStatus() {
    
        if(isDeviceEnabled) {
             
            return DeviceStatus.POWEREDON;

        }
        else {

            return DeviceStatus.TURNEDOFF;
        }

    }

    @Override
    public String toString() {
        return "Tv [isDeviceEnabled=" + isDeviceEnabled + ", name=" + name + ", volume=" + volume + ", channel="
                + channel + "]";
    }
    
}
