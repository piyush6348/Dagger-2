package com.example.dagger2example.car;

import com.example.dagger2example.dagger.ApplicationScope;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Driver {
  // Assume this is some 3rd party library hence we cannot annotate
  // it with @Inject or to any it's dependencies because they are also 3rd party library
}
