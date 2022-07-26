package com.example.samplesyncapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    APIInterface apiInterface;
    TextView animalView;
    TextView specieView;
    TextView breedView;
    TextView premesisView;
    TextView provinceView;
    TextView districtView;
    TextView tehsilView;
    TextView unionCouncilView;
    TextView villageView;
    TextView statView;


    RecyclerView recyclerView;
    AnimalAdapter animalAdapter;
    SpecieAdapter specieAdapter;
    BreedAdapter breedAdapter;
    PremesisAdapter premesisAdapter;
    ProvinceAdapter provinceAdapter;
    DistrictAdapter districtAdapter;
    TehsilAdapter tehsilAdapter;
    UnionCouncilAdapter unionCouncilAdapter;
    VillageAdapter villageAdapter;
    StatAdapter statAdapter;



    HashMap<String, String> map = new HashMap<>();


    //labels setting
    //TextView tv_id_label;
    //TextView tv_specie_code_label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login("asdasd", "test@live.com");
        getData();
        animalView = findViewById(R.id.tv_animal_select);
        animalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Animal> animals;
                animals = getAnimals();
                // Toast.makeText(getApplicationContext(), animals.get(0).getAnimalId(), Toast.LENGTH_LONG).show();

                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                animalAdapter = new AnimalAdapter(animals);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(animalAdapter);
            }
        });


        specieView = findViewById(R.id.tv_species_select);
        specieView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                List<Species> species;
                species = getSpecies();

              /*LinearLayout layout=rootview.findViewById(R.id.ll_animal_card_layout);
               // LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //View vi = inflater.inflate(R.layout.animal_card_layout, null);
                TextView tv_id_label= (TextView) vi.findViewById(R.id.tv_id_label);
                tv_id_label.setText("Specie ID:");
                TextView tv_specie_code_label= vi.findViewById(R.id.tv_color_label);
                tv_specie_code_label.setText("Specie Code");

                layout.addView(tv_id_label);
                layout.addView(tv_specie_code_label);*/

                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                specieAdapter = new SpecieAdapter(species);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(specieAdapter);

            }
        });

        breedView = findViewById(R.id.tv_breed_select);
        breedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Breed> breeds;
                breeds = getBreed();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                breedAdapter = new BreedAdapter(breeds);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(breedAdapter);
            }
        });

        premesisView = findViewById(R.id.tv_premesis_type_select);
        premesisView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<PremesisType> premesisTypes;
                premesisTypes = getPremesisTypes();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                premesisAdapter = new PremesisAdapter(premesisTypes);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(premesisAdapter);
            }
        });

        provinceView = findViewById(R.id.tv_province_select);
        provinceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Province> provinces;
                provinces = getProvince();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                provinceAdapter = new ProvinceAdapter(provinces);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(provinceAdapter);
            }
        });

        districtView = findViewById(R.id.tv_districts_tab);
        districtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<District> districts;
                districts = getDistrict();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                districtAdapter = new DistrictAdapter(districts);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(districtAdapter);
            }
        });

        tehsilView = findViewById(R.id.tv_tehsil_tab);
        tehsilView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Tehsil> tehsils;
                tehsils = getTehsils();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                tehsilAdapter = new TehsilAdapter(tehsils);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(tehsilAdapter);
            }
        });
        unionCouncilView = findViewById(R.id.tv_union_councils_tab);
        unionCouncilView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<UnionCouncil> unionCouncilList;
                unionCouncilList = getUnionCouncils();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                unionCouncilAdapter = new UnionCouncilAdapter(unionCouncilList);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(unionCouncilAdapter);
            }
        });

        villageView = findViewById(R.id.tv_villages_tab);
        villageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Village> villageList;
                villageList = getVillages();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                villageAdapter = new VillageAdapter(villageList);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(villageAdapter);
            }
        });

        statView = findViewById(R.id.tv_stats_tab);
        statView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Stat> statList;
                statList = getStats();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                statAdapter = new StatAdapter(statList);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }
        });
    }


    public void getData()
    {
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String token = sh.getString("token", "");


        OkHttpClient httpClient = new OkHttpClient.Builder()
                .readTimeout(90, TimeUnit.SECONDS)
                .connectTimeout(90, TimeUnit.SECONDS).addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request newRequest  = chain.request().newBuilder()
                                .addHeader("Authorization", "Bearer " + token)
                                .build();
                        return chain.proceed(newRequest);
                    }
                })
                .build();
        Gson gson = new GsonBuilder().setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").create();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://dev-net.punjab.gov.pk/paits/api/MobileApis/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClient)
                .build();
        apiInterface=retrofit.create(APIInterface.class);

        Call<Example> call= apiInterface.getData();
         call.enqueue(new Callback<Example>() {

             @Override
             public void onResponse(Call<Example> call, Response<Example> response) {
                 Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG).show();
                 Example responseFromAPI= response.body();
                 setListToSharedPreference("animalList", responseFromAPI.getData().getAnimals());
                 setListToSharedPreference("specieList", responseFromAPI.getData().getSpecies());
                 setListToSharedPreference("breedList", responseFromAPI.getData().getBreeds());
                 setListToSharedPreference("premesisTypesList", responseFromAPI.getData().getPremesisTypes());
                 setListToSharedPreference("provinceList", responseFromAPI.getData().getProvince());
                 setListToSharedPreference("districtList", responseFromAPI.getData().getDistricts());
                 setListToSharedPreference("tehsilList", responseFromAPI.getData().getTehsils());
                 setListToSharedPreference("unionCouncilList", responseFromAPI.getData().getUnionCouncils());
                 setListToSharedPreference("villageList", responseFromAPI.getData().getVillages());
                 setListToSharedPreference("statList", responseFromAPI.getData().getStats());

             }

             @Override
             public void onFailure(Call<Example> call, Throwable t) {
                 Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
             }
         });

    }

    public <T> void setListToSharedPreference(String key, List<T> list)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        myEdit.putString(key, json);
        myEdit.commit();
    }

    public List<Animal> getAnimals()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Animal> animals;
        String str=sharedPreferences.getString("animalList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Animal>>(){}.getType();
        animals = gson.fromJson(str, type);
        return animals;
    }

    public List<Species> getSpecies()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Species> species;
        String str=sharedPreferences.getString("specieList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Species>>(){}.getType();
        species = gson.fromJson(str, type);
        return species;
    }

    public List<Breed> getBreed()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Breed> breeds;
        String str=sharedPreferences.getString("breedList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Breed>>(){}.getType();
        breeds = gson.fromJson(str, type);
        return breeds;
    }


    public List<PremesisType> getPremesisTypes()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<PremesisType> premesisTypeList;
        String str=sharedPreferences.getString("premesisTypesList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<PremesisType>>(){}.getType();
        premesisTypeList = gson.fromJson(str, type);
        return premesisTypeList;
    }

    public List<Province> getProvince()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Province> provinces;
        String str=sharedPreferences.getString("provinceList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Province>>(){}.getType();
        provinces = gson.fromJson(str, type);
        return provinces;
    }

    public List<District> getDistrict()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<District> districts;
        String str=sharedPreferences.getString("districtList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<District>>(){}.getType();
        districts = gson.fromJson(str, type);
        return districts;
    }

    public List<Tehsil> getTehsils()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Tehsil> tehsils;
        String str=sharedPreferences.getString("tehsilList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Tehsil>>(){}.getType();
        tehsils = gson.fromJson(str, type);
        return tehsils;
    }

    public List<UnionCouncil> getUnionCouncils()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<UnionCouncil> unionCouncils;
        String str=sharedPreferences.getString("unionCouncilList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<UnionCouncil>>(){}.getType();
        unionCouncils = gson.fromJson(str, type);
        return unionCouncils;
    }

    public List<Village> getVillages()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Village> villages;
        String str=sharedPreferences.getString("villageList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Village>>(){}.getType();
        villages = gson.fromJson(str, type);
        return villages;
    }

    public List<Stat> getStats()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        List<Stat> stats;
        String str=sharedPreferences.getString("statList","");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Stat>>(){}.getType();
        stats = gson.fromJson(str, type);
        return stats;
    }

    public void login(String password , String username)
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
        LoginData data = new LoginData(username, password);
        apiInterface=retrofit.create(APIInterface.class);
        String user = new Gson().toJson(data);
        map.put("Content-Type","application/json");
        map.put("token","");
        map.put("Group_ID","");
        map.put("Paits-35SM-Key","ADSANA&$FHD#SA98ALMEHAR");

        Call<LoginResponse> call= apiInterface.login(map,data);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG).show();
                LoginResponse loginResponseFromAPI = response.body();

                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("token", loginResponseFromAPI.getData().getToken());
                myEdit.commit();
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }
}


