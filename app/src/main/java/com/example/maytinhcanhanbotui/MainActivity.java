package com.example.maytinhcanhanbotui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btndaucong, btndautru, btndaunhan, btndauchia, btnrandom;
    TextView txtketqua;
    EditText edtnhapsomin, edtnhapsomax;
    int somin, somax, mvalue;
    Random mRandom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtketqua = (TextView) findViewById(R.id.ketqua);
        edtnhapsomin = (EditText) findViewById(R.id.nhapsomin);
        edtnhapsomax = (EditText) findViewById(R.id.nhapsomax);
        btndaucong = (Button) findViewById(R.id.daucong);
        btndautru = (Button) findViewById(R.id.dautru);
        btndaunhan = (Button) findViewById(R.id.daunhan);
        btndauchia = (Button) findViewById(R.id.dauchia);
        btnrandom = (Button) findViewById(R.id.random);

        btndaucong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nhapsomin = edtnhapsomin.getText().toString();
                int somin = Integer.parseInt(nhapsomin);
                String nhapsomax = edtnhapsomax.getText().toString();
                int somax = Integer.parseInt(nhapsomax);

                int sotong = somin + somax;

                txtketqua.setText(String.valueOf(sotong));
            }
        });
        btndautru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nhapsomin = edtnhapsomin.getText().toString();
                int somin = Integer.parseInt(nhapsomin);
                String nhapsomax = edtnhapsomax.getText().toString();
                int somax = Integer.parseInt(nhapsomax);

                int sotru = somin - somax;

                txtketqua.setText(String.valueOf(sotru));

            }
        });
        btndaunhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nhapsomin = edtnhapsomin.getText().toString();
                int somin = Integer.parseInt(nhapsomin);
                String nhapsomax = edtnhapsomax.getText().toString();
                int somax = Integer.parseInt(nhapsomax);

                int sonhan = somin * somax;

                txtketqua.setText(String.valueOf(sonhan));
            }
        });
        btndauchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nhapsomin = edtnhapsomin.getText().toString();
                int somin = Integer.parseInt(nhapsomin);
                String nhapsomax = edtnhapsomax.getText().toString();
                int somax = Integer.parseInt(nhapsomax);

                int sochia = somin / somax;
                txtketqua.setText(String.valueOf(sochia));
            }
        });


        btnrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nhapsomin = edtnhapsomin.getText().toString();

                String nhapsomax = edtnhapsomax.getText().toString();

                if (nhapsomin.equals("") || nhapsomax.equals("")) {

                    Toast.makeText(MainActivity.this,"ban nhap thieu so",Toast.LENGTH_SHORT).show();
                    return;
                } else{

                    int somax = Integer.parseInt(nhapsomax);
                    int somin = Integer.parseInt(nhapsomin);

                    somax = somin > somax ? somin + 1 : somax;

                    mRandom = new Random();

                    mvalue = mRandom.nextInt(somax -somin + 1 ) + somin;

                    txtketqua.setText(String.valueOf(mvalue));
                }


            }
        });



    }
}
