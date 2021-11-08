package by.tms.homework6.utils;

import java.io.FileNotFoundException;

public final class ExceptionUtils {

    private ExceptionUtils() {
        throw new UnsupportedOperationException();
    }

    public static int getLengthString(String string) throws NullPointerException {
        return string.length();
    }

    public static void elementOfArray(int[] array, int indexOfArray) {
        try {
            int x = array[indexOfArray];
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long getFactorial(int number) throws IllegalArgumentException {
        if (number <= 0 || number >= 20) {
            throw new IllegalArgumentException();
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static double getDivisionResult(int firstNumber, int secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException();
        }
        return (double) firstNumber / secondNumber;
    }

    public static double getRandomException(double random) throws ArithmeticException, NullPointerException, NumberFormatException {
        if (random >= 0 && random < 0.33) {
            throw new ArithmeticException();
        } else if (random >= 0.33 && random < 0.67) {
            throw new NullPointerException();
        } else {
            throw new NumberFormatException();
        }
    }

    public static double throwExceptionFiftyPercent(double random) throws FileNotFoundException {
        if (random >= 0 && random <= 0.5) {
            throw new FileNotFoundException("This is FileNotFoundException");
        }
        return random;
    }
}
