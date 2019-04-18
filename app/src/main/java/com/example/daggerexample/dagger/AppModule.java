package com.example.daggerexample.dagger;

import com.example.daggerexample.Model1;
import com.example.daggerexample.Model2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SubComponent1.class)
public class AppModule {

    @Provides
    @Singleton
    Model1 providesModel1() {
        return new Model1();
    }

    @Provides
    @Singleton
    Model2 providesModel2(Model1 model1) {
        return new Model2(model1);
    }

    @Provides
    @Singleton
    @Named("SomeString")
    String providesSomeString() {
        return "Some Injected String";
    }

    @Provides
    String providesGenericString() {
        return "Generic Text";
    }

}
