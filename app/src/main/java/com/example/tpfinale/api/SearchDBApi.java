package com.example.tpfinale.api;



import com.example.tpfinale.classes.Movies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface SearchDBApi {

    @GET("?api_key=6ebd6e20f260b3c5f75b7297acde9312")
    Call<Movies> getSearch(@Query("query") String query );
}

