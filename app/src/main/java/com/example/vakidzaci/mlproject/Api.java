package com.example.vakidzaci.mlproject;

/**
 * Created by vakidzaci on 4/22/18.
 */
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface Api {

    @FormUrlEncoded
    @POST("/send")
    Call<List<Movie>> getMovie(
            @Field("text") String text

    );

    @GET("/send")
    Call<List<Movie>> getMovie(
    );
}
