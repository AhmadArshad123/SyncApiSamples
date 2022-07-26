package com.example.sampleloginapi;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface PostInterface {

    @POST("Login")
    Call<Example> createPosts(@HeaderMap Map<String,String> defaultData, @Body Data data);
}