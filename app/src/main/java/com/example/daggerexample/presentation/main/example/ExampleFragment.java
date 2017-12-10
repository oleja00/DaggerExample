package com.example.daggerexample.presentation.main.example;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daggerexample.R;
import com.example.daggerexample.databinding.FragmentExampleBinding;
import com.example.daggerexample.presentation.base.BaseFragment;
import com.example.daggerexample.presentation.base.BasePresenter;

import javax.inject.Inject;

public class ExampleFragment extends BaseFragment implements ExampleContract.View {

    private FragmentExampleBinding mBinding;

    @Inject
    ExamplePresenter mPresenter;

    public static ExampleFragment newInstance() {
        return new ExampleFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_example, container, false);

        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.setEventListener(mPresenter);
        mPresenter.attachView(this);

    }

    @NonNull
    @Override
    protected BasePresenter getPresenter() {
        return mPresenter;
    }


}
