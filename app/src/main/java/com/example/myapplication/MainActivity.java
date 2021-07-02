package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview;
        textview = findViewById(R.id.account_id);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String user_ID = bundle.getString("user_ID");
        textview.setText("정승현(" + user_ID + ")님 환영합니다.");


        Button btn_schedule = findViewById(R.id.btn_schedule);
        btn_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Schedule_Activity.class);
                intent.putExtra("name","승현");
                intent.putExtra("userID","root");
                startActivity(intent);
            }
        });
    }
}