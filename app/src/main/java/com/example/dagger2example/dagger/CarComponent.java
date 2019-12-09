package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Car;
import com.example.dagger2example.MainActivity;
import com.example.dagger2example.car.DieselEngine;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = {AppComponent.class}, modules = { WheelsModule.class, PetrolEngineModule.class })
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        CarComponent build();
    }
}
