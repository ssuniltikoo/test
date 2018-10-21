package com.training.java.collections.ArraysDemo;


import java.util.Arrays;

public class DemoArray {

    public static void main(String[] args) {
        int [] iarr ;
        iarr = new int[]{2,3,1,7,9,23,10};

        int[] iarrnew = Arrays.copyOf(iarr,4);

        System.out.println(iarr[5]);
        System.out.println(Arrays.binarySearch(iarr,2));
        for (int a:iarrnew)
            System.out.println(" new array number in array  is" +a);


        Arrays.sort(iarr);
        System.out.println(Arrays.binarySearch(iarr,2));


        Arrays.fill(iarr,6);

        for(int i = 0;i <iarr.length;i++)
        {
            System.out.println("value at location "+i+"is"+iarr[i]);
        }



    }
}
