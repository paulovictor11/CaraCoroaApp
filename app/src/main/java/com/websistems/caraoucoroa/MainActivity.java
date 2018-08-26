package com.websistems.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] opcoes = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnJogar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //gerar número aleatório
        Random random = new Random();
        int numero = random.nextInt(2);

        //0 = cara - 1 = coroa
        Intent intent = new Intent(this, DetalheActivity.class);
        intent.putExtra("resultado", opcoes[numero]);
        startActivity(intent);
    }
}
