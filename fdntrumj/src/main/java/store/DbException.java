package store;

/**
 * Created by tnf on 1/14/19. on 6/22/17.
 */

public class DbException extends Exception {

    public DbException() {
    }

    public DbException(String s) {
        super(s);
    }

    public DbException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
