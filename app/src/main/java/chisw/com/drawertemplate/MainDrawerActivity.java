package chisw.com.drawertemplate;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;

/**
 * Created by Kuzlo on 19.06.2015.
 */
public class MainDrawerActivity extends ToolbarActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDrawer();
        


    }

    private void initDrawer() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.abc_toolbar_collapse_description, R.string.abc_toolbar_collapse_description);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }

    @Override
    protected int getContentLayout() {
        return R.layout.activity_drawer_main;
    }
}
