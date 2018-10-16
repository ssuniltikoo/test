package com.sunil.Student;

public class Students {
    // class var or static variables
     private static  int passingmarks = 35;
     

     public static void setPassing(int newPassig){
         if(newPassig <50 )
             Students.passingmarks=newPassig;
         else
             System.out.println("Passing score cannot be more than 50");
     }

    //inst varioables
    private int sub1, sub2,sub3;

    public Students(int sub1, int sub2, int sub3){
        this. sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public String checkResult(){
        String result = "fail";
        if(sub1 >= passingmarks && sub2 >= passingmarks && sub3 >= passingmarks){
            result="pass";
        }
        return result;
    }



}
