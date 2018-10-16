package com.sunil.StudentResult;

import com.sunil.Student.*;

public class Result {
    public static void main(String[] args) {
        Students st1 = new Students(38,42,55);

        Students st2 = new Students(44,65,71);

        Students st3 = new Students(67,77,72);

        System.out.println("Result for Student 1: "+st1.checkResult());

        System.out.println("Result for Student 2: "+st2.checkResult());

        System.out.println("Result for Student 3: "+st3.checkResult());
        System.out.println("Reset the passing score to 40 ");
        Students.setPassing(40);
        System.out.println("Result for Student 1: "+st1.checkResult());

        System.out.println("Result for Student 2: "+st2.checkResult());

        System.out.println("Result for Student 3: "+st3.checkResult());

        System.out.println("Reset the passing score to 50 ");
        Students.setPassing(55);
        System.out.println("Result for Student 1: "+st1.checkResult());

        System.out.println("Result for Student 2: "+st2.checkResult());

        System.out.println("Result for Student 3: "+st3.checkResult());
    }
}
