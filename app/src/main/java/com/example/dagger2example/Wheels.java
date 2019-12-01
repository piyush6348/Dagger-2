package com.example.dagger2example;

import javax.inject.Inject;

public class Wheels {
    // Assume this is some 3rd party library hence we cannot annotate
    // it with @Inject or to any it's dependencies because they are also 3rd party library
    private Rims rims;
    private Tyres tyres;

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
