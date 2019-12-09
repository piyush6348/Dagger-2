package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2example.car.Car;
import com.example.dagger2example.dagger.CarComponent;
import com.example.dagger2example.dagger.DaggerCarComponent;
import com.example.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  // Field injection
  @Inject
  Car car1, car2;

  CarComponent carComponent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    carComponent = DaggerCarComponent.builder()
            .horsePower(140)
            .engineCapacity(1000)
            .appComponent(((DaggerApplication) getApplication()).getAppComponent())
            .build();
    carComponent.inject(this);
    car1.drive();
    car2.drive();
  }
}
