package com.example.keyboardlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        mainLayout.removeAllViews();

        getLayoutInflater().inflate(R.layout.keyboard_upper, mainLayout);     //  大文字キーボード
//      getLayoutInflater().inflate(R.layout.keyboard_lower, mainLayout);       //  小文字キーボード
//      getLayoutInflater().inflate(R.layout.keyboard_number, mainLayout);      //  英数記号キーボード
    }
}
