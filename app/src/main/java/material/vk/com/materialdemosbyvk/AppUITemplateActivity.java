package material.vk.com.materialdemosbyvk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Vinay on 03/12/17.
 */

public class AppUITemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_ui_template);
        setTitle("App UI Template");

        initViews();
    }

    private void initViews() {

    }
}
