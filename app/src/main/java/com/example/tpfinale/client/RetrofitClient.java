package com.example.tpfinale.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static String BASE_URL = "https://api.themoviedb.org/3/movie/popular/";



    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}

