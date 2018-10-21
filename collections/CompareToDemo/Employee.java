package com.training.java.collections.CompareToDemo;

import java.util.Collections;

public class Employee  implements Comparable<Employee>{
    int empID;
    String empName;
    double salary;


    public Employee(int empID,String empName,double salary){
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }
    public String toString(){
        return "Emp id "+empID +"Emp Name "+empName+" emp salary "+ salary;
    }

    public int compareTo(Employee obj){
            return (this.empID -obj.empID);
    }

}
