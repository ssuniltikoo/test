package DemoIOSystem;

import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.io.*;

public class FileIO {

    public static void main(String[] args) {
        String name = null;
        InputStreamReader reader = new InputStreamReader(System.in);
        //BufferedInputStream bfreader = new BufferedInputStream(System.in);
        BufferedReader breader = new BufferedReader(reader);
        try {
            name = breader.readLine();
            System.err.println(name);

            breader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
