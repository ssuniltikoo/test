package DemoExceptions.UserDefinedException;

public class InvalidDurationException extends RuntimeException{

    public static final int MIN_DURATION = 12;
    public static final int MAX_DURATION = 240;
    public InvalidDurationException(){
        super("Invalid Duration , must be in range "+ MIN_DURATION +" and "+ MAX_DURATION);
    }
}
