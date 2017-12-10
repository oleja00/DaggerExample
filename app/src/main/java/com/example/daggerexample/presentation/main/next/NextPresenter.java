package com.example.daggerexample.presentation.main.next;

import com.example.daggerexample.presentation.base.BasePresenter;
import com.example.daggerexample.presentation.main.MainRouter;

import javax.inject.Inject;

public final class NextPresenter extends BasePresenter<NextFragmentContract.View> implements NextFragmentContract.EventListener {

    private NextFragmentContract.EventDelegate mEventDelegate;

    @Inject
    public NextPresenter(MainRouter router) {
        mEventDelegate = router;
    }


    @Override
    public void onSecondClick() {
        mEventDelegate.showSecondScreen();
    }
}