package com.example.tpfinale.client;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientSearch {
    public static Retrofit retrofit ;
    private static String Base_URL = "https://api.themoviedb.org/3/search/movie/" ;

    public static Retrofit getRetrofitSearch (){
        if(retrofit == null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }
}

