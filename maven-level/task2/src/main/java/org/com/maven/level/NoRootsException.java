package org.com.maven.level;

public class NoRootsException extends Exception {
    public NoRootsException(String message) {
        super(message);
    }

    public NoRootsException() {
        super("Equation has no roots!");
    }
}
