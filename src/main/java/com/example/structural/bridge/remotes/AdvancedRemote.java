package com.example.structural.bridge.remotes;

import com.example.structural.bridge.devices.Device;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {

        super(device);

    }

    public int mute(){

        Device device = getDevice();
        device.setVolume(0);
        return device.getVolume();

    }
}
