package com.sunil;

public class Main {

    public static void main(String[] args) {
	    byte bytevar = 16;

	    int intval = bytevar;

	   float floatvar = intval;

		char charval = '\u0041';
		intval = charval;

		System.out.println(intval);

		float f = (float)22.4;
		// Explicit type conversion
		float n = (float)22/7; // Loss of precision
		System.out.println(" n = :" + n);

		double d = 22.0/2.0;
		System.out.println(" d  = " + d);

		int _1s = 4; // populated at runtime

        // operator is binary , uninary , trinary

        int k = 9;

        int m = k >> 1;
        System.out.println(m);


    }
}
