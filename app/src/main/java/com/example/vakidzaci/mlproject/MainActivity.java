package com.example.vakidzaci.mlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements GetMovies.GetMoviesInterface{


    EditText editText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        editText = (EditText)findViewById(R.id.plot);
        final GetMovies getMovies = new GetMovies(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMovies.getMovies(editText.getText().toString());
            }
        });
    }

    @Override
    public void getMovie(List<Movie> movies, int response_code) {
        if(response_code == 200){
            Intent intent = new Intent(this,MoviesActivity.class);
            intent.putStringArrayListExtra("data",parse(movies));
            startActivity(intent);
        }
    }


    public ArrayList<String> parse(List<Movie> movies){
        ArrayList<String> list = new ArrayList<>();
        for(Movie m : movies){
            Log.d("Log",m.getTitle());
            list.add(m.getTitle());
        }
        return list;
    }
}
