package com.example.daggerexample.dagger;

import com.example.daggerexample.MainActivity;
import com.example.daggerexample.MainFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {

    SubComponent1.Builder subComponentBuilder();

    void inject(MainActivity mainActivity);
    void inject(MainFragment mainFragment);
}
