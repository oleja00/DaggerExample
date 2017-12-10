package com.example.daggerexample.presentation.main.next.injection;

import com.example.daggerexample.di.fragment.FragmentScope;
import com.example.daggerexample.domain.database.DataBaseRepository;

import dagger.Binds;
import dagger.Module;

@Module
public interface NextModule {
    @FragmentScope
    @Binds
    DataBaseRepository repository(DataBaseRepository repository);
}