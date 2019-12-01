package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    PetrolEngine() {

    }
    @Override
    public void start() {
        Log.d(TAG, "start: ");
    }
}
