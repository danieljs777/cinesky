package com.test.sky.cinesky;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.Callback;

public interface SkyAPI {

    @GET("Movies")
    Call<List<Movie>> loadMovies();

}
