package com.example.gerardo.apidatos.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gerardo.apidatos.PagerAdapter;
import com.example.gerardo.apidatos.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {


    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.tabLayout)
    TabLayout tabLayout;
    @Bind(R.id.edit_value)
    EditText editValue;
    @Bind(R.id.btn_buscar)
    ImageButton btnBuscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        setupViewPager(true);
        viewPager.addOnPageChangeListener(this);
        //Setea a que fragment queremos dejar que aparesca al inicio
//        viewPager.setCurrentItem(1,true);

    }

    private void setupViewPager(boolean mostrar) {
        if (mostrar) {
            viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), buildFragments()));
            tabLayout.setupWithViewPager(viewPager);

            try {
                tabLayout.getTabAt(0).setIcon(R.drawable.ic_user);
                tabLayout.getTabAt(1).setIcon(R.drawable.ic_car);
                tabLayout.getTabAt(2).setIcon(R.drawable.ic_phone);
            } catch (NullPointerException e) {
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
        if (id == R.id.action_getImei) {
            TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
            String imei = telephonyManager.getDeviceId();
            if (imei != null){
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText(getString(R.string.msgeImeiCopiado),imei);
                clipboard.setPrimaryClip(clip);

                final Toast toast = Toast.makeText(MainActivity.this, getString(R.string.msgeImeiCopiado), Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 900);
            }else{
                Toast.makeText(MainActivity.this, R.string.msgeNoImei, Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        Log.d("PAGE_SCROLLED", String.valueOf(position));
    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                editValue.setHint(R.string.hintRutNombre);
                break;
            case 1:
                editValue.setHint(R.string.hintPatente);
                break;
            case 2:
                editValue.setHint(R.string.hintImei);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
//        Log.d("PAGE_SCROLLSTATECHANGED", String.valueOf(state));
    }

    @OnClick(R.id.btn_buscar)
    public void onClick() {
    }
}
