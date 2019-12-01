package com.example.dagger2example.dagger;

import com.example.dagger2example.car.DieselEngine;
import com.example.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindDieselEngine(DieselEngine engine);
}
