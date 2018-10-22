package ObjectStream;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class SerialializationDemo {

    static void writeFile(String fileName){
        Employee e1 = new Employee("Ram","Sharma", 25, LocalDate.of(1999,04,12));
        Employee e2 = new Employee("sham","kumar", 22, LocalDate.of(1990,02,12));
        Employee e3 = new Employee("gopal","moh", 30, LocalDate.of(1995,12,12));

        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

        try {
            File fl = new File(fileName);
            if(!fl.exists())
                  fl.createNewFile();
                FileOutputStream out = new FileOutputStream(fl);
                ObjectOutputStream objout = new ObjectOutputStream(out);
                objout.writeObject(emps);
                /*objout.writeObject(e2);
            objout.writeObject(e3);
            objout.writeObject(e4);
            objout.writeObject(e5);*/
                objout.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }

    static void readFile(String filename){
        try {
            FileInputStream in = new FileInputStream(filename);
            ObjectInputStream objin = new ObjectInputStream(in);
            Object emp = objin.readObject();
            //Collections.sort((ArrayList)emp);
            ArrayList<Employee> alist = (ArrayList<Employee>)emp;
            //System.out.println(alist);
            for (Employee x:alist){
                System.out.println(x);
            }
           // for(int i=0;i<alist.size();i++)
            //if(emp instanceof Employee)
               // System.out.println(alist[i]);


        }catch (Exception e){

        }



    }

}
