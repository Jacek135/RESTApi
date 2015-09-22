package org.koushik.javabrains.messenger.exception;

/**
 * Created by jacek on 22.09.15.
 */
public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionID = -3124559883201L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
