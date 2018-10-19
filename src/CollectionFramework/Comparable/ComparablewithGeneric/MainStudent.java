package CollectionFramework.Comparable.ComparablewithGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(110,"timmy" , "zhimmy", 90));
        students.add(new Student(99,"simpy" , "ahimmy", 90));
        students.add(new Student(101,"dimmy" , "ghimmy", 90));
        students.add(new Student(76,"immy" , "chimmy", 90));
        students.add(new Student(67,"fimmy" , "ohimmy", 90));
        //students.add("sjkjk");
        Collections.sort(students);

        System.out.println("After Sorting");
        for (Student obj:students){
            System.out.println(obj);
        }



    }
}
