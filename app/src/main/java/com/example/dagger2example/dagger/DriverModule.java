package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Driver;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

  @ApplicationScope
  @Provides
  public static Driver provideDriver() {
    return new Driver();
  }
}
