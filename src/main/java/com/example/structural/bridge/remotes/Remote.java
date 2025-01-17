package com.example.structural.bridge.remotes;

import com.example.structural.bridge.devices.Device;
import com.example.structural.bridge.devices.DeviceStatus;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        DeviceStatus deviceStatus = device.getDeviceStatus();
        switch (deviceStatus) {
            case TURNEDOFF:
                System.out.println(device.getName() + " got powered on");
                device.enable();
                break;
            case POWEREDON:
                System.out.println(device.getName() + " got turned off");
                device.disable();
            default:
                break;
        }
    }

    public int volumeUp() {

        int deviceVolume = device.getVolume();
        device.setVolume(++deviceVolume);
        return deviceVolume;

    }

    public int volumeDown(){

        int deviceVolume = device.getVolume();
        device.setVolume(--deviceVolume);
        return deviceVolume;

    }

    public int channelUp(){

        int channel = device.getChannel();
        device.setChannel(++channel);
        return channel;

    }

    public int channelDown(){

        int channel = device.getChannel();
        device.setChannel(--channel);
        return channel;

    }

    public Device getDevice() {

        return this.device;

    }
    
}
