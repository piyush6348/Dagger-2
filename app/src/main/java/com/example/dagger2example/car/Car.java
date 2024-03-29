package com.example.dagger2example.car;

import android.util.Log;

import com.example.dagger2example.dagger.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    // Constructor Injection
    @Inject
    public Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive() {
        Log.d(TAG, driver + "driving car " + this);
        this.engine.start();
    }

    // Method Injection
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    @Inject
    void enableRemoteAgain(Remote remote) {
        remote.setListener(this);
    }
}
