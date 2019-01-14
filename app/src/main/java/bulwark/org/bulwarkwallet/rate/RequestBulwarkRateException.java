package fundin.org.fundinwallet.rate;

/**
 * Created by kaali on 7/5/17.
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
