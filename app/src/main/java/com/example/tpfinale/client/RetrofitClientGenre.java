package com.example.tpfinale.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientGenre {
    public static Retrofit retrofit;
    private static String BASE_URL_GENRES ="https://api.themoviedb.org/3/genre/movie/";

    public static Retrofit getRetrofitInstanceGenres() {
        if(retrofit == null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL_GENRES)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }
}
