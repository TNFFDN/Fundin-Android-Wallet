package fundin.org.fundinwallet.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import fundin.org.fundinwallet.ui.wallet_activity.WalletActivity;

/**
 * Created by tnf on 1/14/19. on 10/19/17.
 */

public class NavigationUtils {

    public static void goBackToHome(Activity activity){
        Intent upIntent = new Intent(activity,WalletActivity.class);
        upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(upIntent);
        activity.finish();
    }

}
