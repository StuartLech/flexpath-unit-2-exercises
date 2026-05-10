package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends Exception {
    private final double a;
    private final double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public CustomDivideByZeroException(double a, double b) {
        super("Attempted to divide " + a + " by zero");
        this.a = a;
        this.b = b;
    }
}
