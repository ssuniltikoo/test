package com.sunil.app;

import com.sunil.logic.Calculator;
import com.sunil.logic.Dog;
public class main {

    public static void main(String[] args) {
        // new instructs jvm to create object of type calculator class
        // then store its reference in variable 'c1'
        Calculator c1 = new Calculator();
        // Another variable
        Calculator d = c1;
        double k = c1.doSum(12.2,5656.22);
        System.out.println(k);

        Dog dogg1 = new Dog();
        /*dogg1.size = "big";
        dogg1.breed ="Maltese";
        dogg1.age = 4;
        dogg1.color = "brown";*/
        System.out.println(dogg1.getInfo());
    }

}
