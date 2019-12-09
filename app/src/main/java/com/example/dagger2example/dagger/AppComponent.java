package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Driver;

import dagger.Component;

@ApplicationScope
@Component(modules = {DriverModule.class})
public interface AppComponent {
  Driver getDriver();
}
