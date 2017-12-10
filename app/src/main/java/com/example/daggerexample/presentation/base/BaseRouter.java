package com.example.daggerexample.presentation.base;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class BaseRouter {

    private FragmentManager mFragmentManager;

    public BaseRouter(AppCompatActivity activity) {
        this.mFragmentManager = activity.getSupportFragmentManager();
    }

    protected void addFragment(int viewGroupId, @NonNull BaseFragment fragment, String tag) {
        mFragmentManager
                .beginTransaction()
                .add(viewGroupId, fragment, tag)
                .commitAllowingStateLoss();
    }

    protected void addFragmentWithBackStack(int viewGroupId, @NonNull BaseFragment fragment, String tag) {
        mFragmentManager
                .beginTransaction()
                .addToBackStack(tag)
                .add(viewGroupId, fragment, tag)
                .commitAllowingStateLoss();
    }

    protected void replaceFragmentWithBackStack(int viewGroupId, @NonNull BaseFragment fragment, String tag) {
        mFragmentManager
                .beginTransaction()
                .replace(viewGroupId, fragment)
                .addToBackStack(tag)
                .commit();
    }

    protected void replaceFragment(int viewGroupId, @NonNull BaseFragment fragment, String tag) {
        mFragmentManager
                .beginTransaction()
                .replace(viewGroupId, fragment)
                .commit();
    }

}
