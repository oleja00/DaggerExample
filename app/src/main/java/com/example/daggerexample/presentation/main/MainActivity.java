package com.example.daggerexample.presentation.main;

import android.os.Bundle;

import com.example.daggerexample.R;
import com.example.daggerexample.presentation.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    MainRouter mRouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRouter.openExampleFragment();
    }
}
