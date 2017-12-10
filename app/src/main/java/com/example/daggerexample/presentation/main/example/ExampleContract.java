package com.example.daggerexample.presentation.main.example;




import com.example.daggerexample.presentation.base.BaseView;


public interface ExampleContract {

    interface EventDelegate {
        void showNextFragment();
    }

    interface EventListener {
        void onNextClicked();

    }

    interface View extends BaseView {

    }

}
