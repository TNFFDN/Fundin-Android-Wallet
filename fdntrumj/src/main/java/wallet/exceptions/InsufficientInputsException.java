package wallet.exceptions;

import org.fundinj.core.Coin;

/**
 * Created by tnf on 1/14/19. on 8/9/17.
 */

public class InsufficientInputsException extends Exception {

    private final Coin missing;

    public InsufficientInputsException(String s,Coin missing) {
        super(s);
        this.missing = missing;
    }

    public Coin getMissing() {
        return missing;
    }
}
