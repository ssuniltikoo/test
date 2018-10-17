package com.sunil.DemoComputerP.Hardware;

import com.sunil.DemoComputerP.Computer;

public class BuildComputer {
    public static void main(String[] args) {
        Storage hd = new HardDisk();
        Display mon = new Monitor();
        Computer c = new Computer(hd,mon);

    }
}
