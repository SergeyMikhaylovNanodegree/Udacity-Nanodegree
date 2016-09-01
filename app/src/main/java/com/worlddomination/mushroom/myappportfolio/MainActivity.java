package com.worlddomination.mushroom.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);
        Button btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btnBaconReader = (Button)findViewById(R.id.btn_bacon_reader);
        Button btnCapstoneMyApp = (Button)findViewById(R.id.btn_capstone_my_app);
        Button btnLibraryApp = (Button)findViewById(R.id.btn_library_app);
        Button btnScoreApp = (Button) findViewById(R.id.btn_scores_app);
        Button btnSpotifyStreamer = (Button)findViewById(R.id.btn_spotify_streamer);

        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack(view, R.string.btn_build_it_bigger);
            }
        });
        btnBaconReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack(view, R.string.btn_bacon_reader);
            }
        });
        btnCapstoneMyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack(view, R.string.btn_capstone_my_app);
            }
        });
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack(view, R.string.btn_library_app);
            }
        });
        btnScoreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack(view, R.string.btn_scores_app);
            }
        });
        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack(view, R.string.btn_spotify_streamer);
            }
        });
    }

    public void showSnack (View view,  int id){
        String name = getResources().getString(id);
        Snackbar.make(view, "This button will launch "+ name , Snackbar.LENGTH_LONG).show();
    }


}