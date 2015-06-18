package chisw.com.drawertemplate;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


/**
 * Created by Kuzlo on 18.06.2015.
 */
public abstract class ToolbarActivity extends AppCompatActivity{

    protected Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentLayout());
        initToolbar();

    }


    private void initToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if(mToolbar ==null){
            throw new RuntimeException("in activity layout resource must be toolbar");
        }
        setSupportActionBar(mToolbar);
    }

    protected void initBackButton(){
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home) {
                onBackPressed();
        }
        return true;
    }

    protected abstract int getContentLayout();
}
