package com.example.daggerexample.presentation.main.next;

import com.example.daggerexample.presentation.base.BaseView;

public interface NextFragmentContract {
    interface View  extends BaseView{
    }

    interface EventListener {
        void onSecondClick();
    }

    interface EventDelegate {
        void showSecondScreen();
    }
}