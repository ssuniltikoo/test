package com.training.java.collections.DemoArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.training.java.collections.VarArgs.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add('s');
        items.add('T');
        items.add(5);
        items.add(2);
        varcharDemo v = new varcharDemo();
        items.add(v);
        items.remove(2);
        items.add(90);
        items.add(89);
        items.add(5);

        Collections.sort(items); // error
        Iterator it = items.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }
        it.remove();
        System.out.println("break");
        Iterator itn = items.iterator();
        while(itn.hasNext()){

            System.out.println(itn.next());
          //  it.remove();
        }






    }
}

