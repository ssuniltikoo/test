package CollectionFramework.Comparable.ComparablewithGeneric;


//Allow comparing student with student only
public class Student implements Comparable<Student> {

    private int rollno;
    private String firstName;

    public Student(int rollno, String firstName, String lastName, int age) {
        this.rollno = rollno;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private String lastName;
    private int age;

    public String toString(){
        return rollno+", name "+firstName + " " + lastName + " age " + age;
    }

    public  int compareTo(Student obj){
        System.out.println("using CompareTo");

        return this.rollno -obj.rollno;



    }
}
