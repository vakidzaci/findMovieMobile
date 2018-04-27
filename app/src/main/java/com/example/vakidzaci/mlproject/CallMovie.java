package com.example.vakidzaci.mlproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CallMovie {

    @SerializedName("text")
    @Expose
    private String text;

    /**
     * No args constructor for use in serialization
     *
     */
    public CallMovie() {
    }

    /**
     *
     * @param text
     */
    public CallMovie(String text) {
        super();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CallMovie withText(String text) {
        this.text = text;
        return this;
    }

}