package com.example.dagger2example.dagger;

import com.example.dagger2example.car.DieselEngine;
import com.example.dagger2example.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    @Provides
    Engine provideDieselEngine(DieselEngine engine) {
        return engine;
    }
}
