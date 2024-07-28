package com.jspace.movieapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1, e2, e3, e4, e5, e6, e7, e8,e0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    try{
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1 = (AppCompatButton)findViewById(R.id.subb);
        b2=(AppCompatButton)findViewById((R.id.viwe));
        e0=(EditText)findViewById(R.id.name);
        e1 = (EditText) findViewById(R.id.actor);
        e2 = (EditText) findViewById(R.id.actress);
        e3 = (EditText) findViewById(R.id.rele);
        e5 = (EditText) findViewById(R.id.gross);
        e6 = (EditText) findViewById(R.id.distri);
        e7 = (EditText) findViewById(R.id.por);
        e8 = (EditText) findViewById(R.id.lan);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Viewing..",Toast.LENGTH_LONG).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam = e0.getText().toString();
                String actor = e1.getText().toString();
                String actress = e2.getText().toString();
                String rele = e3.getText().toString();
                String gross = e4.getText().toString();
                String distri = e5.getText().toString();
                String por = e6.getText().toString();
                String lan = e7.getText().toString();
                String vvie = e8.getText().toString();
                Toast.makeText(getApplicationContext(),nam+" "+actor,Toast.LENGTH_LONG).show();

            }
        });
    }
    catch (Exception e){
        Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
    }
    }
}