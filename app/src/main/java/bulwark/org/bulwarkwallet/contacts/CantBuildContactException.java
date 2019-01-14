package fundin.org.fundinwallet.contacts;

/**
 * Created by kaali on 7/1/17.
 */
public class CantBuildContactException extends RuntimeException {
    public CantBuildContactException(Exception e) {
        super(e);
    }
}
