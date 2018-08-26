package com.websistems.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Intent intent = getIntent();

        imgResultado = findViewById(R.id.imgResultado);

        if (intent != null){
            final String resultado = intent.getStringExtra("resultado");

            if (resultado.equals("cara")){
                //exibe imagem cara
                imgResultado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            } else {
                //exibe imagem coroa
                imgResultado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        findViewById(R.id.btnVoltar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
