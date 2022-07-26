package com.example.samplesyncapi;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("Login")
    Call<LoginResponse> login(@HeaderMap Map<String,String> defaultData, @Body LoginData data);

    @POST("SyncData")
    Call<Example> getData();
}
