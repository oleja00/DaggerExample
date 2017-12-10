package com.example.daggerexample.presentation.main.next;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daggerexample.R;
import com.example.daggerexample.databinding.FragmentNextBinding;
import com.example.daggerexample.presentation.base.BaseFragment;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class NextFragment extends BaseFragment implements NextFragmentContract.View {

    @Inject
    NextPresenter mPresenter;
    private FragmentNextBinding mBinding;

    public static NextFragment newInstance() {
        return new NextFragment();
    }

    @NonNull
    @Override
    protected NextPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        AndroidSupportInjection.inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_next, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.setEventListener(mPresenter);
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.detachView();
    }

}
