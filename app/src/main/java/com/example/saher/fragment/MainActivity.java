package com.example.saher.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    Button bt_move1;
    ViewPager viewPager;
    FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(fragmentAdapter);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(0);
        
    }
}
