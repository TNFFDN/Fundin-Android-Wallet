package store;

/**
 * Created by tnf on 1/14/19. on 6/14/17.
 */

public class CantInsertAddressException extends Exception {

    public CantInsertAddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantInsertAddressException(String message) {
        super(message);
    }
}
