package com.rtstudio.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgResultado;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgResultado = findViewById(R.id.ImgResultadoId);
        btnVoltar = findViewById(R.id.btnVoltarId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            Integer resultado = bundle.getInt("resultado");
            if (resultado == 0) {
                imgResultado.setImageResource(R.drawable.moeda_cara);
            } else {
                imgResultado.setImageResource(R.drawable.moeda_coroa);
            }
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultadoActivity.this, MainActivity.class));
            }
        });
    }
}
