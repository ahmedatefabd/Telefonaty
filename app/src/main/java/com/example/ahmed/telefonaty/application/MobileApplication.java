package com.example.ahmed.telefonaty.application;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by ahmed on 1/4/2018.
 */

public class MobileApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AndroidNetworking.initialize(getApplicationContext());

    }
}
