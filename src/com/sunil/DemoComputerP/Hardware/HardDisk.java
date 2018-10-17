package com.sunil.DemoComputerP.Hardware;

public class HardDisk implements Storage {

    @Override
    public void Write() {
        System.out.println("Storage Harddisk Writ");
    }

    @Override
    public void Read() {
        System.out.println("Storage harddisk read");
    }
}
