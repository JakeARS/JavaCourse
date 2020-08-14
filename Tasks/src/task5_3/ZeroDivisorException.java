package task5_3;

public class ZeroDivisorException extends Exception {

    ZeroDivisorException() {

    }

    ZeroDivisorException(String message) {
        super(message);
    }
}