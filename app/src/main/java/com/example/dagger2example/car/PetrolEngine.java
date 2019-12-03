package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Provides;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: horsePower = " + horsePower + "engineCapacity = " + engineCapacity);
    }
}
