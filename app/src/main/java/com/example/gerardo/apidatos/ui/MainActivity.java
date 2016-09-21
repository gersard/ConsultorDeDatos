package com.example.gerardo.apidatos.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.gerardo.apidatos.PagerAdapter;
import com.example.gerardo.apidatos.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.tabLayout)
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupViewPager(true);

    }

    private void setupViewPager(boolean mostrar){
        if (mostrar) {
            viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), buildFragments()));
            tabLayout.setupWithViewPager(viewPager);

            try{
                tabLayout.getTabAt(0).setIcon(R.drawable.ic_user);
                tabLayout.getTabAt(1).setIcon(R.drawable.ic_car);
                tabLayout.getTabAt(2).setIcon(R.drawable.ic_phone);
            }catch (NullPointerException e){
                e.printStackTrace();
            }

        }

    }

    private ArrayList<Fragment> buildFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();

        PersonaFragment personaFragment = new PersonaFragment();
        PatenteFragment patenteFragment = new PatenteFragment();
        ImeiFragment imeiFragment = new ImeiFragment();

        fragments.add(personaFragment);
        fragments.add(patenteFragment);
        fragments.add(imeiFragment);

        return fragments;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
