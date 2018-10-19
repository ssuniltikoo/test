package DemoExceptions.UserDefinedException;

public class InvalidrateException extends RuntimeException{
    public static final double MIN_RATE = 4.5;
    public static final double MAX_RATE = 12.5;
    public InvalidrateException(){
        super("Invalid Rate , must be in range "+ MIN_RATE +" and "+ MAX_RATE);
    }
}
