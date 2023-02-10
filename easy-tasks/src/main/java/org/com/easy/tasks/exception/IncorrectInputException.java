package org.com.easy.tasks.exception;

public class IncorrectInputException extends Exception {

    public IncorrectInputException() {
        super("Incorrect input!");
    }

    public IncorrectInputException(String message) {
        super(message);
    }
}
