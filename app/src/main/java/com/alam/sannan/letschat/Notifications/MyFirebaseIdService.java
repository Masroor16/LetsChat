package com.alam.sannan.letschat.Notifications;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.alam.sannan.letschat.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

import org.jetbrains.annotations.NotNull;

public class MyFirebaseIdService extends FirebaseMessagingService{


   /* public MyFirebaseIdService() {
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(
                task -> {
                    if (task.isSuccessful()) {
                        String token;
                        token = task.getResult();
                        Log.i("token ---->>", token);
                        updateToken(token);

                    }
                }
        );
    }*/

    @Override
    public void onNewToken(@NotNull String t) {
        super.onNewToken(t);
        // whatever you want
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser != null){
            updateToken(t);
        }
    }
    private void updateToken(String refreshToken) {
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Tokens");
        Token token = new Token(refreshToken);
        assert firebaseUser != null;
        reference.child(firebaseUser.getUid()).setValue(token);
    }
}
