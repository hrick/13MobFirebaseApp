package com.example.logonrm.a13mobfirebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics firebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic("mob");
    }

    public void forcarCrash(View view) {
        throw new ExceptionInInitializerError();
    }

    public void cliqueMe(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("NOME", "henrique");
        firebaseAnalytics.logEvent("cliqueMe", bundle);
    }
}
