package com.example.wetalk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.*;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    
    @BindView(R.id.main_page_toolbar)    Toolbar mToolbar;
    @BindView(R.id.main_tabs)    TabLayout mTabLayout;
    @BindView(R.id.main_tabs_pager)    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);{
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setTitle("WeTalk");
        }
    }
}
