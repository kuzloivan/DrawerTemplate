package chisw.com.drawertemplate;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

/**
 * Created by Kuzlo on 18.06.2015.
 */
public class MainActivity extends ToolbarActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBackButton();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainDrawerActivity.class));
            }
        });
    }

    @Override
    protected int getContentLayout() {
        return R.layout.activity_main;
    }
}
