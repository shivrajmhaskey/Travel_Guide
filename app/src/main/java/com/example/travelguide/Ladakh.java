package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ladakh extends AppCompatActivity {
    Button mmt3,mmt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladakh);
        mmt3= findViewById(R.id.button2);
        mmt4= findViewById(R.id.button);

        mmt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.makemytrip.com/hotels/leh-hotels.html");
            }
        });
        mmt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.makemytrip.com/flights/new_delhi-leh-cheap-airtickets.html");
            }
        });

    }

    private void goLink(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}