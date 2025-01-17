package com.example.structural.bridge.devices;

public class Radio implements Device {

    private boolean isDeviceEnabled;
    private int volume;
    private int frequency;
    private String name;

    public Radio() {

        this.isDeviceEnabled = false;
        this.name = "Radio";

    }

    @Override
    public boolean isEnabled() {
        
        return isDeviceEnabled;

    }

    @Override
    public void enable() {
        
        this.isDeviceEnabled = true;

    }

    @Override
    public void disable() {
        
        this.isDeviceEnabled = false;

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
        
        return this.frequency;

    }

    @Override
    public void setChannel(int channel) {

        this.frequency = channel;

    }

    @Override
    public String getName() {
        return name;
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
        return "Radio [isDeviceEnabled=" + isDeviceEnabled + ", volume=" + volume + ", frequency=" + frequency
                + ", name=" + name + "]";
    }
    
}
