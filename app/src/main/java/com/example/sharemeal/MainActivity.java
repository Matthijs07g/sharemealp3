package com.example.sharemeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal_list);
    }
    void open(){
        Log.i(TAG, "madfafadfgffadfadafgfadfsradagfd");
    }

    public void add(View view) {
        setContentView(R.layout.add_meal);
    }
}