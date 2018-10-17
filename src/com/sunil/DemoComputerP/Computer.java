package com.sunil.DemoComputerP;

import com.sunil.DemoComputerP.Hardware.Display;
import com.sunil.DemoComputerP.Hardware.Storage;

public class Computer  {

    private Storage storage;

    private Display display;

    public Computer(Storage storage, Display display){
        this.display = display;
        this.storage = storage;

        this.display.Show();
        this.storage.Read();
        this.storage.Write();
    }



    public void Build(){

    }
}
