package com.training.java.collections.ComparatorDemo;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

    public int compare(Employee obj1, Employee obj2){
        if(obj1.salary > obj2.salary)
            return 1;
        if(obj1.salary < obj2.salary)
            return -1;
        else
          return 0;

    }
}
