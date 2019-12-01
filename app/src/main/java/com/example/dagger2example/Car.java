package com.example.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    // Constructor Injection
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "driving");
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
