package com.example.daggerexample.presentation.base;

import android.support.annotation.CallSuper;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BasePresenter<V extends BaseView> {
    private CompositeDisposable mDisposables;
    private V view;

    @CallSuper
    public void attachView(V view) {
        this.view = view;
        this.mDisposables = new CompositeDisposable();
    }

    @CallSuper
    public void detachView() {
        if (this.mDisposables != null) {
            this.mDisposables.dispose();
            this.mDisposables = null;
        }
        this.view = null;
    }

    public V getView() {
        return this.view;
    }

    public boolean isDetached() {
        return this.view == null;
    }

    protected void manageDisposable(Disposable disposable) {
        this.mDisposables.add(disposable);
    }

    protected void dispose(Disposable disposable) {
        if (disposable != null) {
            this.mDisposables.remove(disposable);
        }
    }
}
