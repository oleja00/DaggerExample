package com.example.daggerexample.presentation.second;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.daggerexample.R;
import com.example.daggerexample.presentation.base.BaseActivity;

public class SecondActivity extends BaseActivity {

    public static void run(Context context) {
        context.startActivity(new Intent(context, SecondActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

}
