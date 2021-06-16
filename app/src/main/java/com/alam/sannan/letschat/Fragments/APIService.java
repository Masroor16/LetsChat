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
                    "Authorization:key=Your key"
            }
    )

    @POST("fcm/send/")
    Call<MyResponse> sendNotification(@Body Sender body);
}
