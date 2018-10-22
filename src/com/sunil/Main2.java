package com.sunil;

public class Main2 {

    public static void main(String args[]){
        int num=7;
        boolean isPrime=true;
        for(int i = 2;i< num/2; i++){
            if(num%i==0){
                isPrime=false;
                System.out.println(num + " is divisible by : " + i);
                break;
            }
        }

        if(isPrime)
        {
            System.out.println(num +" is prime");
        }
        else{
            System.out.println(num+" is not prime");
        }
        drawline(100); // method innovocation
        drawline();
    }
    // static banding -- compiling binding
    static void drawline(int width){
        for(int i = 0;i<width;i++){
            System.out.print("-");
        }
    }


    // for compiler - one method with different names - for compiler its is compiler sees - one entry for one method
    static void drawline(){
        for(int i = 0;i<455;i++){
            System.out.print("*");


        }
    }
}
