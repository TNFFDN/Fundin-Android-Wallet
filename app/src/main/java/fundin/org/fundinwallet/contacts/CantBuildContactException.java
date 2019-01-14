package fundin.org.fundinwallet.contacts;

/**
 * Created by tnf on 1/14/19. on 7/1/17.
 */
public class CantBuildContactException extends RuntimeException {
    public CantBuildContactException(Exception e) {
        super(e);
    }
}
