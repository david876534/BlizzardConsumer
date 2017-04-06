package com.ssu385.blizzardconsumer.landing.viewcontroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ssu385.blizzardconsumer.R;
import com.ssu385.blizzardconsumer.boss.viewcontroller.activity.BossActivity;

public class LandingActivity extends AppCompatActivity {

    private Button bossButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        bossButton = (Button)findViewById(R.id.boss_button);
        bossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingActivity.this, BossActivity.class);
                startActivity(intent);
            }
        });
    }
}
