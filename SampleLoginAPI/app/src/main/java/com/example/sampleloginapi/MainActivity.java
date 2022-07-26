package com.example.sampleloginapi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FieldMap;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText et_user_name;
    EditText et_password;
    PostInterface postInterface;
    HashMap<String, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.login_button);
        et_password= findViewById(R.id.password_field);
        et_user_name= findViewById(R.id.username_field);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et_user_name.getText().toString()) || TextUtils.isEmpty(et_password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please enter both the values", Toast.LENGTH_SHORT).show();
                    return;
                }
                postData(et_password.getText().toString(), et_user_name.getText().toString());
            }
        });

    }




    public void postData(String password , String username)
    {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .readTimeout(90, TimeUnit.SECONDS)
                .connectTimeout(90, TimeUnit.SECONDS)
                .build();
        Gson gson = new GsonBuilder().setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").create();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://dev-net.punjab.gov.pk/paits/api/MobileApis/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClient)
                .build();
        Data data = new Data(username, password);
        postInterface=retrofit.create(PostInterface.class);
        String user = new Gson().toJson(data);
        map.put("Content-Type","application/json");
        map.put("token","");
        map.put("Group_ID","");
        map.put("Paits-35SM-Key","ADSANA&$FHD#SA98ALMEHAR");

        Call<Example> call= postInterface.createPosts(map,data);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG).show();
                Example responseFromAPI = response.body();
                TextView textView = findViewById(R.id.hello_text);
                textView.setText(responseFromAPI.getData().getUserName());
                Toast.makeText(getApplicationContext(),response.code() +" "+ response.message(),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });




    }


}