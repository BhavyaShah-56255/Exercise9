package pl.vistula;

public class LessThanOneException extends Exception {
    public LessThanOneException(String errorMessage) {
        super(errorMessage);
    }
}