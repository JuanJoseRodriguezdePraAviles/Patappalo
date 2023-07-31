package com.example.patappalo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        ArrayList<String> coordenadasTablero = new ArrayList<String>();
        coordenadasTablero.add("a1");
        coordenadasTablero.add("a2");
        coordenadasTablero.add("a3");
        coordenadasTablero.add("a4");
        coordenadasTablero.add("a5");
        coordenadasTablero.add("a6");
        coordenadasTablero.add("a7");
        coordenadasTablero.add("a8");
        coordenadasTablero.add("b1");
        coordenadasTablero.add("b2");
        coordenadasTablero.add("b3");
        coordenadasTablero.add("b4");
        coordenadasTablero.add("b5");
        coordenadasTablero.add("b6");
        coordenadasTablero.add("b7");
        coordenadasTablero.add("b8");
        coordenadasTablero.add("c1");
        coordenadasTablero.add("c2");
        coordenadasTablero.add("c3");
        coordenadasTablero.add("c4");
        coordenadasTablero.add("c5");
        coordenadasTablero.add("c6");
        coordenadasTablero.add("c7");
        coordenadasTablero.add("c8");
        coordenadasTablero.add("d1");
        coordenadasTablero.add("d2");
        coordenadasTablero.add("d3");
        coordenadasTablero.add("d4");
        coordenadasTablero.add("d5");
        coordenadasTablero.add("d6");
        coordenadasTablero.add("d7");
        coordenadasTablero.add("d8");
        coordenadasTablero.add("e1");
        coordenadasTablero.add("e2");
        coordenadasTablero.add("e3");
        coordenadasTablero.add("e4");
        coordenadasTablero.add("e5");
        coordenadasTablero.add("e6");
        coordenadasTablero.add("e7");
        coordenadasTablero.add("e8");
        coordenadasTablero.add("f1");
        coordenadasTablero.add("f2");
        coordenadasTablero.add("f3");
        coordenadasTablero.add("f4");
        coordenadasTablero.add("f5");
        coordenadasTablero.add("f6");
        coordenadasTablero.add("f7");
        coordenadasTablero.add("f8");
        coordenadasTablero.add("g1");
        coordenadasTablero.add("g2");
        coordenadasTablero.add("g3");
        coordenadasTablero.add("g4");
        coordenadasTablero.add("g5");
        coordenadasTablero.add("g6");
        coordenadasTablero.add("g7");
        coordenadasTablero.add("g8");
        coordenadasTablero.add("h1");
        coordenadasTablero.add("h2");
        coordenadasTablero.add("h3");
        coordenadasTablero.add("h4");
        coordenadasTablero.add("h5");
        coordenadasTablero.add("h6");
        coordenadasTablero.add("h7");
        coordenadasTablero.add("h8");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int casillaIndex = random.nextInt(coordenadasTablero.size());
                String casilla = coordenadasTablero.get(casillaIndex);
                if(coordenadasTablero.size()>1)
                    coordenadasTablero.remove(casillaIndex);
                txt.setText(casilla);
            }
        });
    }
}