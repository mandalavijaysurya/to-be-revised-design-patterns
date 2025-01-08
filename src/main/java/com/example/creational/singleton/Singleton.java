package com.example.creational.singleton;

public class Singleton{

    private static Singleton singletonObject;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        synchronized(Singleton.class){
            if(singletonObject == null)
                singletonObject = new Singleton();
        }
        return singletonObject;
    }
}