package com.sunil.oops.InterfaceDemo;

public interface FlyAble {

    int speed = 100;

    public void fly();

    default  void flyHigh(){
        int vspeed = 900;
        System.out.println("speed is high"+900);
    }

    public static void naviage(){
        System.out.println("Naviagte ");
    }


}
