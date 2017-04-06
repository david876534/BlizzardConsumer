package com.ssu385.blizzardconsumer.core.viewcontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ssu385.blizzardconsumer.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
