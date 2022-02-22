package main.exceptions;

public class UserNotUpdatedException extends Exception {
    String message;

    public UserNotUpdatedException(String message) {
        super(message);
    }
}
