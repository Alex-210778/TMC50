package by.tms.homework6.myexceptions;

public class MyException extends ArithmeticException {

    public MyException() {
        super();
    }

    public MyException(Throwable cause) {
        super(String.valueOf(cause));
    }

    public MyException(String message) {
        super("number = 0");
    }
}
