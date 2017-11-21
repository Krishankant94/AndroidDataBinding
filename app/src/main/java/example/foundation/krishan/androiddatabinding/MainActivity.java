package example.foundation.krishan.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.foundation.krishan.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ProductObject mProduct = new ProductObject(android.R.drawable.ic_dialog_info, "Navy blue sandals", 34.50, "Beautiful fitted sandals for work");
        bindings.setProduct(mProduct);
    }
}
