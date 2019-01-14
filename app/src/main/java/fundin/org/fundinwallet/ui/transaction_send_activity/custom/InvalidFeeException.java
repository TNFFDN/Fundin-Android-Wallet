package fundin.org.fundinwallet.ui.transaction_send_activity.custom;

/**
 * Created by tnf on 1/14/19.
 */

class InvalidFeeException extends Exception {

    public InvalidFeeException(String message) {
        super(message);
    }
}
