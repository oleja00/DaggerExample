package com.example.daggerexample.di.app;


import com.example.daggerexample.data.network.NetWorkRepositoryImpl;
import com.example.daggerexample.di.activity.activity.ActivityScope;
import com.example.daggerexample.domain.network.NetWorkRepository;
import com.example.daggerexample.presentation.main.MainActivity;
import com.example.daggerexample.presentation.main.MainModule;
import com.example.daggerexample.presentation.second.SecondActivity;
import com.example.daggerexample.presentation.second.SecondActivityModule;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class})
public interface AppModule extends AndroidInjector {
    @Singleton
    @Binds
    NetWorkRepository repository(NetWorkRepositoryImpl repository);

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainModule.class})
    MainActivity mainActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = {SecondActivityModule.class})
    SecondActivity secondActivityInjector();
}