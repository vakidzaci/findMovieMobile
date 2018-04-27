package com.example.vakidzaci.mlproject;

/**
 * Created by vakidzaci on 4/22/18.
 */

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * Created by Admin on 15.04.2017.
 */

public class BaseApi {
    public static final String BASE_URL = "http://192.168.0.195:8080/";
    private static Retrofit retrofit = null;
    public static Retrofit getRetrofit() {

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(2, MINUTES)
                .writeTimeout(1, MINUTES)
                .readTimeout(1, MINUTES)
                .build();

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        return retrofit;
    }

    public static Api api() {
        return getRetrofit().create(Api.class);
    }

}
