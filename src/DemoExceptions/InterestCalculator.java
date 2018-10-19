package DemoExceptions;

import DemoExceptions.UserDefinedException.InvalidDurationException;
import DemoExceptions.UserDefinedException.InvalidprincipalException;
import DemoExceptions.UserDefinedException.InvalidrateException;

public class InterestCalculator {
    static void calc(double p, double r, int d) {
        if(p<InvalidprincipalException.MIN_PRINCIPAL || p>InvalidprincipalException.MAX_PRINCIPAL)
            throw new InvalidprincipalException();
        if(r<InvalidDurationException.MIN_DURATION || r>InvalidDurationException.MAX_DURATION)
            throw new InvalidDurationException();
        if(d<InvalidrateException.MIN_RATE || InvalidrateException.MAX_RATE>240)
            throw new InvalidrateException();

        double interest = p*r/100*12*d;
        System.out.println("interest "+interest);
    }
}
