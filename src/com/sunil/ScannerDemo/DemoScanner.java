package com.sunil.ScannerDemo;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // Scanner is a utility class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Hello "  +name+  "your age is " + age);
        sc.close();


    }

}
