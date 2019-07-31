package com.test.sky.cinesky;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieController{
    static final String BASE_URL = "https://sky-exercise.herokuapp.com/api/";

    public void getData(Callback<List<Movie>> response) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        SkyAPI skyApi = retrofit.create(SkyAPI.class);

        Call<List<Movie>> call = skyApi.loadMovies();
        call.enqueue(response);

    }



}
