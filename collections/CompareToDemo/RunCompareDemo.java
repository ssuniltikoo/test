package com.training.java.collections.CompareToDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RunCompareDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new Employee(1001,"Amy",450000));
        employees.add(new Employee(1041,"Ran",23000));
        employees.add(new Employee(1008,"Babun",250000));
        employees.add(new Employee(1301,"Charle",70000));

        Collections.sort(employees);

        Iterator it = employees.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }

    }

}
