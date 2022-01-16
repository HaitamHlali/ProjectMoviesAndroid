package com.example.tpfinale.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientUpcoming {
    public static Retrofit retrofit;
    private static  String BASE_URL2 = "https://api.themoviedb.org/3/movie/upcoming/";

    public static Retrofit getRetrofitUpcoming() {
        if (retrofit==null) {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL2)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
