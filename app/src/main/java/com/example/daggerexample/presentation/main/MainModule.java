package com.example.daggerexample.presentation.main;



import com.example.daggerexample.di.activity.activity.ActivityScope;
import com.example.daggerexample.di.fragment.FragmentScope;
import com.example.daggerexample.presentation.base.BaseRouter;
import com.example.daggerexample.presentation.main.example.ExampleFragment;
import com.example.daggerexample.presentation.main.example.di.ExampleModule;
import com.example.daggerexample.presentation.main.next.NextFragment;
import com.example.daggerexample.presentation.main.next.injection.NextModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainModule {

    @ActivityScope
    @Binds
    BaseRouter router(MainRouter mainRouter);

    @FragmentScope
    @ContributesAndroidInjector(modules = {ExampleModule.class})
    ExampleFragment exampleFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = {NextModule.class})
    NextFragment nextFragment();
}