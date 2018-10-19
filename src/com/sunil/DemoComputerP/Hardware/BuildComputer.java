package com.sunil.DemoComputerP.Hardware;

import com.sunil.DemoComputerP.Computer;

public class BuildComputer {
    public static void main(String[] args) {

        // variable of Base Type can hold object of derived type - Polymorphic object creation
        Storage hd = new HardDisk();
        Display mon = new Monitor();
        Computer c = new Computer(hd,mon);

    }
}
