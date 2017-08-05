package com.example.logonrm.a13mobfirebaseapp.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MeuFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        sendRegistrationToService(refreshedToken);
    }

    private void sendRegistrationToService(String refreshedToken) {
        Log.d("FIREBASE_REGISTRATION","Refresh token " + refreshedToken);
    }
}
