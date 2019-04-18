package com.example.daggerexample.dagger;

import com.example.daggerexample.SecondaryFragment;
import com.example.daggerexample.SubScope;

import dagger.Subcomponent;

@SubScope
@Subcomponent(modules = AppSubComponentModule.class)
public interface SubComponent1 {
    @Subcomponent.Builder
    interface Builder {
        public SubComponent1.Builder subModule(AppSubComponentModule module);
        public SubComponent1 build();
    }
    public void inject(SecondaryFragment secondaryFragment);
}
