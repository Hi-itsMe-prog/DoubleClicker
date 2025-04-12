package com.example.pusheenclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int count1 = 0;
    private int count2 = 0;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        if (savedInstanceState != null) {
            count1 = savedInstanceState.getInt("count1", 0);
            count2 = savedInstanceState.getInt("count2", 0);
        }


        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        Counters();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count1", count1);
        outState.putInt("count2", count2);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count1 = savedInstanceState.getInt("count1");
        count2 = savedInstanceState.getInt("count2");
        Counters();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private void Counters() {
        textView2.setText(String.valueOf(count1));
        textView3.setText(String.valueOf(count2));
    }


    public void Button1(View view) {
        count1++;
        Counters();
    }

    public void Button2(View view) {
        count2++;
        Counters();
    }
}