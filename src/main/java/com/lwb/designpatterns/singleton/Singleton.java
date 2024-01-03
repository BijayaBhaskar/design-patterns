package com.lwb.designpatterns.singleton;

public class Singleton {

    //Private Constructor
    private Singleton(){}

    //private instance
    private static Singleton instance;

    //global point of access
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
