package task5_2;

public class PositionMoreThanSizeException extends Exception {

    PositionMoreThanSizeException() {

    };

    PositionMoreThanSizeException(String message){
        super(message);
    }
}