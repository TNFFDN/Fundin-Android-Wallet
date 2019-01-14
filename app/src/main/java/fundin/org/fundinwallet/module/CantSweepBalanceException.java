package fundin.org.fundinwallet.module;

import java.util.concurrent.TimeoutException;

/**
 * Created by tnf on 1/14/19. on 10/7/17.
 */

public class CantSweepBalanceException extends Throwable {
    public CantSweepBalanceException(String s,Exception e) {
        super(s,e);
    }
}
