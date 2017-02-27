package com.edwinacubillos.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eNumero = (EditText) findViewById(R.id.eNumero);
    }

    public void click(View view){
        int id = view.getId();
        switch (id){
            case R.id.b0: eNumero.setText("100");
                break;
            case R.id.b1: eNumero.setText("200");
                break;
        }
    }
}
