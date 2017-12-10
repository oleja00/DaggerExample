package com.example.daggerexample.presentation.main.example;


import com.example.daggerexample.presentation.base.BasePresenter;
import com.example.daggerexample.presentation.main.MainRouter;

import javax.inject.Inject;

public class ExamplePresenter extends BasePresenter<ExampleContract.View>
        implements ExampleContract.EventListener {

    private ExampleContract.EventDelegate mEventDelegate;

    @Inject
    ExamplePresenter(MainRouter router) {
        this.mEventDelegate = router;
    }

    @Override
    public void onNextClicked() {
        mEventDelegate.showNextFragment();
    }
}
