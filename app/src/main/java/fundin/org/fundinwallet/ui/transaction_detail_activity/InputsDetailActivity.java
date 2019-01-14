package fundin.org.fundinwallet.ui.transaction_detail_activity;

import android.os.Bundle;
import android.view.ViewGroup;

import fundin.org.fundinwallet.R;
import fundin.org.fundinwallet.ui.base.BaseActivity;

/**
 * Created by tnf on 1/14/19.
 */

public class InputsDetailActivity extends BaseActivity {

    @Override
    protected void onCreateView(Bundle savedInstanceState, ViewGroup container) {
        setTitle("Inputs Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getLayoutInflater().inflate(R.layout.inputs_tx_detail_main,container);
    }
}
