package com.example.structural.bridge;

import com.example.structural.bridge.devices.*;
import com.example.structural.bridge.remotes.AdvancedRemote;

public class BridgeMain {
    
    public static void main(String[] args) {
        Device device = new Radio();
        AdvancedRemote remote = new AdvancedRemote(device);

        System.out.println("Turning on device");
        remote.togglePower();

        for(int i = 0; i < 10; i++){

            System.out.println("Increasing channel");
            remote.channelUp();
            System.out.println(device);

        }

        System.out.println("Decreasing channel");
        remote.channelDown();

        System.out.println(device);

        System.out.println("Increasing volume");
        remote.volumeUp();

        System.out.println(device);

        System.out.println("Muting device");
        remote.mute();

        System.out.println(device);

        System.out.println("Turning off device");
        remote.togglePower();

    }

}
