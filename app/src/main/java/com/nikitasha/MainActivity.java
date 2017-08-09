package com.nikitasha;

import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.background.DownloadAllItems;
import com.background.DownloadProductType;
import com.multidexController.Controller;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private  NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controller controller=new Controller();
        controller.attachBaseContext(getApplicationContext());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setHome();

    }
    private void setHome(){
         HomeFragment homeFragment = new HomeFragment();
        Bundle args = new Bundle();
        //args.putInt(MainActivity.ARG_PLANET_NUMBER, 0);
        //fragment.setArguments(args);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, homeFragment).commit();
        // update selected item and title, then close the drawer
//        navigationView.setCheckedItem(0);
        setTitle("HOME");


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();
        if(id==R.id.nav_HomeID){
          //  new DownloadProductType(MainActivity.this,getApplicationContext(),null).execute("");
            HomeFragment homeFragment = new HomeFragment();
            Bundle args = new Bundle();
            fragmentManager.beginTransaction().replace(R.id.content_frame, homeFragment).commit();
            setTitle("Home");
            drawer.closeDrawer(navigationView);

        }else if(id==R.id.nav_CategoryID){
            CategoryFragment categoryFragment= new CategoryFragment();
            Bundle args = new Bundle();
            fragmentManager.beginTransaction().replace(R.id.content_frame, categoryFragment).commit();
            setTitle("Category");
            drawer.closeDrawer(navigationView);

        }else if(id==R.id.nav_our_product_id){
            OurProductFragment ourProductFragment = new OurProductFragment();
            Bundle args = new Bundle();
            fragmentManager.beginTransaction().replace(R.id.content_frame, ourProductFragment).commit();
            setTitle("Our Products");
            drawer.closeDrawer(navigationView);

        }else if(id==R.id.nav_About_id){
            AboutUsFragment aboutUsFragment = new AboutUsFragment();
            Bundle args = new Bundle();
            fragmentManager.beginTransaction().replace(R.id.content_frame, aboutUsFragment).commit();
            setTitle("CONTACT US");
            drawer.closeDrawer(navigationView);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
