package com.training.java.collections.VarArgs;

public class varcharDemo {

    int sum(int ... num){
       int sum = 0;
       for(int a :num)
        sum +=a;
       return sum;
    }

    int sum(int a, int b){
        System.out.println("a+b method");
        return a+b;
    }

    int sum(int a, int b, int c){
        System.out.println("a+b+c");
        return a+b+c;
    }

}
