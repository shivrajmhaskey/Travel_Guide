package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Goa extends AppCompatActivity {
    Button mmt1, mmt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);
        mmt1= findViewById(R.id.hotelbutton);
        mmt2= findViewById(R.id.flightbutton);

        mmt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.makemytrip.com/hotels/goa-hotels.html");
            }
        });

        mmt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.makemytrip.com/flights/new_delhi-goa-cheap-airtickets.html");
            }
        });
    }

    private void goLink(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}