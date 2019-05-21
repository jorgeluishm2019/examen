package com.error404.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button btnUno=(Button)findViewById(R.id.celfa);
            Button btnDos=(Button) findViewById(R.id.fahcel);
            Button btnTres=(Button) findViewById(R.id.celkel);
            Button btnCuatro=(Button)findViewById(R.id.kelcel);

            btnUno.setOnClickListener(this);
            btnDos.setOnClickListener(this);
            btnTres.setOnClickListener(this);
            btnCuatro.setOnClickListener(this);

            public void onClick(View v){
                switch (v.getId()){

                    case R.id.celfa:
                        break;
                    case R.id.fahcel:
                        break;
                    case R.id.celkel:
                        break;
                    case R.id.kelcel:
                        break;
                        default:
                            break;
                            
                }
        }
    }
}
