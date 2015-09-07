package com.example.eric.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnTouch(View v) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Hello, World!");
    }
}
