package fundin.org.fundinwallet.ui.base;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import fundin.org.fundinwallet.FundinApplication;
import fundin.org.fundinwallet.module.FundinModule;

/**
 * Created by tnf on 1/14/19. on 6/29/17.
 */

public class BaseFragment extends Fragment {

    protected FundinApplication fundinApplication;
    protected FundinModule fundinModule;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fundinApplication = FundinApplication.getInstance();
        fundinModule = fundinApplication.getModule();
    }

    protected boolean checkPermission(String permission) {
        int result = ContextCompat.checkSelfPermission(getActivity(),permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}
