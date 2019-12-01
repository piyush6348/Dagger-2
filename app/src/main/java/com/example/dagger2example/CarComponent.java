package com.example.dagger2example;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
