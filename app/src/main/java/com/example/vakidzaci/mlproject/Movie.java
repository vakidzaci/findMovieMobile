package com.example.vakidzaci.mlproject;

/**
 * Created by vakidzaci on 4/22/18.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    public Movie(Double distance, Integer id, String title) {
        super();
        this.distance = distance;
        this.id = id;
        this.title = title;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Movie withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Movie withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie withTitle(String title) {
        this.title = title;
        return this;
    }

}
