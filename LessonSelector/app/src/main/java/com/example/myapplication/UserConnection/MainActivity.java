package com.example.myapplication.UserConnection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private Switch dayOrNight;
    private TextView switchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dayOrNight = (Switch) findViewById(R.id.switch1);
        dayOrNight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                LinearLayout l1 = findViewById(R.id.aim);
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "夜晚模式已启动", Toast.LENGTH_SHORT).show();
                    l1.setBackground(getResources().getDrawable(R.drawable.main_background));
                } else {
                    Toast.makeText(MainActivity.this, "白天模式已启动", Toast.LENGTH_SHORT).show();
                    l1.setBackground(getResources().getDrawable(R.drawable.day_model));
                }
            }
        });
    }

    public void toTarget(Class cl) {
        Intent intent = new Intent(this, cl);
        startActivity(intent);
    }

    public void get_into_stu_input(View view) {
        toTarget(stu_input.class);
    }

    public void get_into_tea_input(View v) {
        toTarget(tea_input.class);
    }

    public void get_into_admin_input(View v) {
        toTarget(admin_input.class);
    }

    public void exit_program(View v) {
        finish();
    }

    public void get_into_description(View v) {
        toTarget(description.class);
    }
}
