package com.example.dagger2example;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.doSomeImportantWorkJustAfterInitialising();
        return tyres;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }
}
