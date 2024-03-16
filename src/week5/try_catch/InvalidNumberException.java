package week5.try_catch;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String errorMessage) {
        super(errorMessage);
    }
}
