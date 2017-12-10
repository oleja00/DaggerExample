package com.example.daggerexample.presentation.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

public abstract class BaseFragment extends Fragment {
    @NonNull
    protected abstract BasePresenter getPresenter();


    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    public void onDestroy() {
        getPresenter().detachView();
        super.onDestroy();
    }
}
