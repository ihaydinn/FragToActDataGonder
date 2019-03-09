package com.ismailhakkiaydin.fragtoactdatagonder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyListener{

    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonuc = findViewById(R.id.tvSonuc);
    }

    @Override
    public void saylariTopla(int sayi1, int sayi12) {
        int toplam = sayi1+sayi12;
        sonuc.setText("Sonuç : "+toplam);
    }
}
