package com.example.daggerexample.presentation.main.example.di;



import com.example.daggerexample.di.fragment.FragmentScope;
import com.example.daggerexample.domain.database.DataBaseRepository;

import dagger.Binds;
import dagger.Module;

@Module
public interface  ExampleModule {
    @FragmentScope
    @Binds
    DataBaseRepository repository(DataBaseRepository repository);

}
