package by.tms.homework6.myexceptions;

public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }
}

