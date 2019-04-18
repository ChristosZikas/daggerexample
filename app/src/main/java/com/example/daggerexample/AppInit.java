package com.example.daggerexample;

import android.app.Application;

import com.example.daggerexample.dagger.AppComponent;
import com.example.daggerexample.dagger.DaggerAppComponent;

public class AppInit extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public static AppComponent getInjector() { return appComponent; }
}
