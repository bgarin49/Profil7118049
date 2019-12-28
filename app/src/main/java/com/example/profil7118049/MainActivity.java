package com.example.profil7118049;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_setting;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_setting=(Button)findViewById(R.id.btn_setting);

        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);

            }

        });
    }
    }