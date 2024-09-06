package com.example.travelguide;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;

public class Homepage extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        button1 = findViewById(R.id.goa);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 =new Intent(Homepage.this, Goa.class);
                startActivity(i1);


            }
        });

button2= findViewById(R.id.kashmir);
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i2 =new Intent(Homepage.this, Kashmir.class);
        startActivity(i2);



    }
});

button3 = findViewById(R.id.jodhpur);
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i3 = new Intent(Homepage.this, Jodhpur.class);
        startActivity(i3);

    }
});

button4 =findViewById(R.id.ladakh);
button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i4 = new Intent(Homepage.this, Ladakh.class);
        startActivity(i4);

    }
});


        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_items,menu);
        return true;
    }
}
