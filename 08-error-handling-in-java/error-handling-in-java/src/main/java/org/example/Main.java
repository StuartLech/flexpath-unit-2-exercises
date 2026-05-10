package org.example;

import java.util.List;

/**
 * Main exercise class.
 */
public class Main {
    public static double safeDivision(double a, double b) {
        if (b == 0.0) {
            return 0;
        }

        return a / b;
    }

    public static String getSecondLetter(String s, List<String> logMessages) {
        try {
            return s.substring(1, 2);
        } catch (StringIndexOutOfBoundsException e) {
            return "";
        } finally {
            logMessages.add("Exiting method");
        }
    }

    public static String readFile(List<String> logMessages) {
        try (FakeFileReader reader = new FakeFileReader(logMessages)) {
            return reader.read();
        }
    }

    public static double safeDivideWithCustomException(double a, double b) throws CustomDivideByZeroException {
        if (b == 0.0) {
            throw new CustomDivideByZeroException(a, b);
        }
        return a / b;
    }
}
