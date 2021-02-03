package com.example.animations2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        //ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        //bartImageView.animate().translationYBy(1000).setDuration(2000);  //Image floats down the screen
        //bartImageView.animate().translationXBy(-1000).setDuration(2000);    // image floats to the left
        //bartImageView.animate().rotation(1800).alpha(0).setDuration(2000); // image spins and disappears
        //bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3500); // shrinks image
        bartImageView.animate().rotation(1800).alpha(0).translationXBy(3000);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        bartImageView.setX(-1100); // This set the initial screen empty
        bartImageView.animate().translationXBy(1000).rotation(3600).setDuration(15000); // Bart spins in from the left



    }
}