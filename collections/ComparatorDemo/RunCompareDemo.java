package com.training.java.collections.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class RunCompareDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new Employee(1001,"Amy",450));
        employees.add(new Employee(1041,"Ran",230));
        employees.add(new Employee(1008,"Babun",250));
        employees.add(new Employee(1301,"Charle",700));

        Collections.sort(employees,new SortByName());

        Iterator it = employees.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }

    }

}
