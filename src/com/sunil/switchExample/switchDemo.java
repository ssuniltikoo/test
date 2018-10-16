package com.sunil.switchExample;

public class switchDemo {
    public static void main(String[] args) {

        int numofAngles = 5;

        switch(numofAngles){
            case 3:
                System.out.println("triangle");
                break;
            case 4:
                System.out.println("rectangle");
                break;
            case 5:
                System.out.println("pentagon");
                break;
            default:
                System.out.println("unknown shape");
        }
    }
}
