package com.alam.sannan.letschat.Notifications;

import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.InstallationTokenResult;

public class Sender {

    public Data data;
    public String to;

    public Sender(Data data, String to) {
        this.data = data;
        this.to = to;
    }
}
