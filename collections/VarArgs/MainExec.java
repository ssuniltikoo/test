package com.training.java.collections.VarArgs;

public class MainExec {
    public static void main(String[] args) {
        varcharDemo v = new varcharDemo();
        System.out.println( v.sum(2,3));
        System.out.println(v.sum(5,6,7));
        System.out.println(v.sum(10,12,14,20,40));

    }
}
