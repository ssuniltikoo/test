package DemoExceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int k = 100/0;
            int data[] = new int[1];
            data[3] = k;
            System.out.println("Answer is "+k);
        }
        catch (RuntimeException ex)
        {
            System.out.println("exception block");
            System.out.println(ex.getMessage());
        }
        System.out.println("Ewnd of main");

    }
}
