package com.sunil.oops.InterfaceDemo;

public class Airplane implements FlyAble {

    @Override
    public void fly() {
        System.out.println("fly ");
        FlyAble.naviage();
    }

    @Override
    public void flyHigh() {
        System.out.println("Airplane alitiute flying @ 300");
    }

}
