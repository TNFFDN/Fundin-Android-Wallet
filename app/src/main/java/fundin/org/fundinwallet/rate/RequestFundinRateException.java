package fundin.org.fundinwallet.rate;

/**
 * Created by tnf on 1/14/19.
 */
public class RequestFundinRateException extends Exception {
    public RequestFundinRateException(String message) {
        super(message);
    }

    public RequestFundinRateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestFundinRateException(Exception e) {
        super(e);
    }
}
