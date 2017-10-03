package com.example.tj.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Button button = (Button) findViewById(R.id.Tela2);
    }

    public void tela2(View v){
        Intent it = new Intent(this, Tela2.class);
        startActivity(it);
    }
}
