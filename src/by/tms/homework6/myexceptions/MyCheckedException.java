package by.tms.homework6.myexceptions;

import java.io.IOException;

public class MyCheckedException extends IOException {

    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCheckedException(Throwable cause) {
        super(cause);
    }
}
