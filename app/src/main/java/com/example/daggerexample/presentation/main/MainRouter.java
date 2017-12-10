package com.example.daggerexample.presentation.main;




import com.example.daggerexample.R;
import com.example.daggerexample.presentation.base.BaseRouter;
import com.example.daggerexample.presentation.main.example.ExampleContract;
import com.example.daggerexample.presentation.main.example.ExampleFragment;
import com.example.daggerexample.presentation.main.next.NextFragment;
import com.example.daggerexample.presentation.main.next.NextFragmentContract;
import com.example.daggerexample.presentation.second.SecondActivity;

import javax.inject.Inject;

public class MainRouter extends BaseRouter implements
        ExampleContract.EventDelegate,
        NextFragmentContract.EventDelegate{

    private MainActivity mActivity;

    @Inject
    MainRouter(MainActivity activity) {
        super(activity);
        this.mActivity = activity;
    }

    void openExampleFragment() {
        addFragment(R.id.container, ExampleFragment.newInstance(), ExampleFragment.class.getSimpleName());
    }

    @Override
    public void showNextFragment() {
        replaceFragmentWithBackStack(R.id.container, NextFragment.newInstance(), NextFragment.class.getSimpleName());
    }

    @Override
    public void showSecondScreen() {
        SecondActivity.run(mActivity);
    }
}
