package com.alam.sannan.letschat.Fragments;

import com.alam.sannan.letschat.Notifications.MyResponse;
import com.alam.sannan.letschat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAATcZd8W8:APA91bHC6AW91cJQB4BuZlHYXEaMdsLUF419-SxXPgk00xlwdrps3A8Zlmb9UhthuYQjsjhVbKFsO5foVbuJbrapT3pnLhK6Jkgim-UhQe--ExPXsY61rR1HpVInLu9cTV2ccFAk0ZiH"
            }
    )

    @POST("fcm/send/")
    Call<MyResponse> sendNotification(@Body Sender body);
}
