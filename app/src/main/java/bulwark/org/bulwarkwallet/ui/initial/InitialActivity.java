package fundin.org.fundinwallet.ui.initial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import fundin.org.fundinwallet.FundinApplication;
import fundin.org.fundinwallet.ui.splash_activity.SplashActivity;
import fundin.org.fundinwallet.ui.wallet_activity.WalletActivity;
import fundin.org.fundinwallet.utils.AppConf;

/**
 * Created by kaali on 8/19/17.
 */

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FundinApplication fundinApplication = FundinApplication.getInstance();
        AppConf appConf = fundinApplication.getAppConf();
        // show report dialog if something happen with the previous process
        Intent intent;
        if (!appConf.isAppInit() || appConf.isSplashSoundEnabled()){
            intent = new Intent(this, SplashActivity.class);
        }else {
            intent = new Intent(this, WalletActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
