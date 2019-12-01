package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Field injection
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerCarComponent.create().inject(this);
        car.drive();
    }
}
