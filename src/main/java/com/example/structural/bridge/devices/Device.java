package com.example.structural.bridge.devices;

public interface Device {

    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
    String getName();
    DeviceStatus getDeviceStatus();

}
