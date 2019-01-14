package fundin.org.fundinwallet.module;

/**
 * Created by tnf on 1/14/19.
 */

public class UpgradeException extends Exception {

    public UpgradeException(String message) {
        super(message);
    }

    public UpgradeException(String message, Throwable cause) {
        super(message, cause);
    }
}
