package com.example.vakidzaci.mlproject;

/**
 * Created by vakidzaci on 4/22/18.
 */

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Admin on 17.04.2017.
 */

public class GetMovies {

    String plot;
    GetMoviesInterface getMovieInterface;

    public GetMovies(GetMoviesInterface getMovieInterface){
        this.getMovieInterface = getMovieInterface;
    }

    public interface GetMoviesInterface {
        void getMovie(List<Movie> movies, int response_code);
    }

    public void getMovies(String text) {
        Api service = BaseApi.api();
        CallMovie callMovie = new CallMovie(text);
        Call<List<Movie>> call = service.getMovie(text);
        Log.d("Log",call.request().url().toString());
        call.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                Log.d("Log",""+response.code());
                getMovieInterface.getMovie(response.body(), response.code());
            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {
                Log.d("Log",  "Throwable = " + t.toString());
                getMovieInterface.getMovie(null, 0);

            }
        });
    }


}

