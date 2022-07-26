package com.example.samplesyncapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login("asdasd", "test@live.com");


      /*  animalView = findViewById(R.id.tv_animal_select);
        animalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<Animal> animals;
                animals = getAnimals();
                Toast.makeText(getApplicationContext(), animals.get(0).getAnimalId(), Toast.LENGTH_LONG).show();
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                animalAdapter = new AnimalAdapter(animals);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(animalAdapter);
            }
        });*/


        specieView = findViewById(R.id.tv_species_select);
        specieView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                List<Species> species = Species.listAll(Species.class);
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
                List<Breed> breeds= Breed.listAll(Breed.class);
               // breeds = dbHelper.readBreeds();
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
                List<PremesisType> premesisTypes= PremesisType.listAll(PremesisType.class);
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
                List<Province> provinces=Province.listAll(Province.class);
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
                List<District> districts= District.listAll(District.class);
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
                List<Tehsil> tehsils=Tehsil.listAll(Tehsil.class);
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
                List<UnionCouncil> unionCouncilList=UnionCouncil.listAll(UnionCouncil.class);
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
                List<Village> villageList= Village.listAll(Village.class);
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
                List<Stat> statList= Stat.listAll(Stat.class);
                recyclerView = (RecyclerView) findViewById(R.id.rv_card_container);
                statAdapter = new StatAdapter(statList);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(statAdapter);
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
                }).build();

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
                 Toast.makeText(getApplicationContext(), "Data Fetched!", Toast.LENGTH_LONG).show();
                 Example responseFromAPI= response.body();
                 Species.deleteAll(Species.class);
                 Breed.deleteAll(Breed.class);
                 Village.deleteAll(Village.class);
                 PremesisType.deleteAll(PremesisType.class);
                 Province.deleteAll(Province.class);
                 District.deleteAll(District.class);
                 Tehsil.deleteAll(Tehsil.class);
                 UnionCouncil.deleteAll(UnionCouncil.class);
                 Stat.deleteAll(Stat.class);

              for(int i = 0; responseFromAPI.getData().getVillages().size() > i; i++)
                 {
                     Village village=new Village(responseFromAPI.getData().getVillages().get(i).getVillageId(),
                             responseFromAPI.getData().getVillages().get(i).getVillageName(),
                             responseFromAPI.getData().getVillages().get(i).getVillageCode(),
                             responseFromAPI.getData().getVillages().get(i).getUnionCouncilId());
                     village.save();

                 }
                 for(int i = 0; responseFromAPI.getData().getSpecies().size() > i; i++)
                 {
                     Species species= new Species(responseFromAPI.getData().getSpecies().get(i).getSpecieId(),
                             responseFromAPI.getData().getSpecies().get(i).getSpecieName(),
                             responseFromAPI.getData().getSpecies().get(i).getSpecieCode());
                     species.save();
                 }

                 for(int i = 0; responseFromAPI.getData().getBreeds().size() > i; i++)
                 {
                     Breed breed= new Breed(responseFromAPI.getData().getBreeds().get(i).getBreedId(),
                             responseFromAPI.getData().getBreeds().get(i).getBreedName(),
                             responseFromAPI.getData().getBreeds().get(i).getBreedCode(),
                             responseFromAPI.getData().getBreeds().get(i).getSpecieId());
                     breed.save();


                 }

                 for(int i = 0; responseFromAPI.getData().getPremesisTypes().size() > i; i++)
                 {
                     PremesisType premesisType=new PremesisType(responseFromAPI.getData().getPremesisTypes().get(i).getPremTypeId(),
                             responseFromAPI.getData().getPremesisTypes().get(i).getPremTypeName());
                     premesisType.save();

                 }

                 for(int i = 0; responseFromAPI.getData().getProvince().size() > i; i++)
                 {
                     Province province=new Province(responseFromAPI.getData().getProvince().get(i).getProvinceId(),
                             responseFromAPI.getData().getProvince().get(i).getProvinceName(),
                             responseFromAPI.getData().getProvince().get(i).getProvinceCode(),
                             responseFromAPI.getData().getProvince().get(i).getContry());
                     province.save();
                 }

                 for(int i = 0; responseFromAPI.getData().getTehsils().size() > i; i++)
                 {
                     Tehsil tehsil=new Tehsil(responseFromAPI.getData().getTehsils().get(i).getTehsilId(),
                             responseFromAPI.getData().getTehsils().get(i).getTehsilName(),
                             responseFromAPI.getData().getTehsils().get(i).getTehsilCode(),
                             responseFromAPI.getData().getTehsils().get(i).getDistrictId());
                     tehsil.save();
                 }

                 for(int i = 0; responseFromAPI.getData().getDistricts().size() > i; i++)
                 {
                     District district=new District(responseFromAPI.getData().getDistricts().get(i).getDistrictId(),
                             responseFromAPI.getData().getDistricts().get(i).getDistrictName(),
                             responseFromAPI.getData().getDistricts().get(i).getDistrictCode(),
                             responseFromAPI.getData().getDistricts().get(i).getDivision(),
                             responseFromAPI.getData().getDistricts().get(i).getProvinceId());
                     district.save();
                 }

                 for(int i = 0; responseFromAPI.getData().getUnionCouncils().size() > i; i++)
                 {
                     UnionCouncil unionCouncil=new UnionCouncil(responseFromAPI.getData().getUnionCouncils().get(i).getUnionId(),
                             responseFromAPI.getData().getUnionCouncils().get(i).getUnionName(),
                             responseFromAPI.getData().getUnionCouncils().get(i).getUnionCode(),
                             responseFromAPI.getData().getUnionCouncils().get(i).getTehsilId());
                     unionCouncil.save();
                 }

                 for(int i = 0; responseFromAPI.getData().getStats().size() > i; i++)
                 {
                     Stat stat = new Stat(responseFromAPI.getData().getStats().get(i).getName(),
                             responseFromAPI.getData().getStats().get(i).getCount());
                     stat.save();
                 }
             }

             @Override
             public void onFailure(Call<Example> call, Throwable t) {
                 Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
             }
         });

    }

    public void login(String password , String username)
    {
        ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();
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
                LoginResponse loginResponseFromAPI = response.body();

                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("token", loginResponseFromAPI.getData().getToken());
                myEdit.commit();
                getData();
                progress.dismiss();
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }
}


