package com.example.daggerexample.dagger;

import com.example.daggerexample.SubScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class AppSubComponentModule {

    @SubScope
    @Provides
    @Named("TEST1")
    String providesTest1String() {
        return "Sub Component 1 injection";
    }

    @SubScope
    @Provides
    @Named("TEST2")
    String providesTest2String() {
        return "Sub Component 2 injection";
    }

    @SubScope
    @Provides
    @Named("TEST3")
    String providesTest3String() {
        return "Sub Component 3 injection";
    }

}
