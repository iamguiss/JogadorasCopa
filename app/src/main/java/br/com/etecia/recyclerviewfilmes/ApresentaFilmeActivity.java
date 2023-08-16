package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

import java.sql.Time;

public class ApresentaFilmeActivity extends AppCompatActivity {

    TextView mTitulo, mCategoria, mDescricao;
    ImageView mImagem;
    Button btnVoltar;

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        mTitulo = findViewById(R.id.mTitulo);
        View mTime = findViewById(R.id.mTime);
        View mPosicao = findViewById(R.id.mPosicao);
        mImagem = findViewById(R.id.mImagemJogadora);
        btnVoltar = findViewById(R.id.btnVoltar);

        idToolbar = findViewById(R.id.idToolBar);

        //Clique o botão na toolbar
        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        //Declarando intent para receber valor
        Intent intent = getIntent();
        //Declarando as variáveis que irão receber o valor
        String titulo, Time, Posição;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        Time = intent.getExtras().getString("Time");
        Posição = intent.getExtras().getString("posicão");


        imagemFilme = intent.getExtras().getInt("ImagemFilme");

        mTitulo.setText(titulo);
        mDescricao.setText(Time);
        mCategoria.setText(Posição);
        mImagem.setImageResource(imagemFilme);

    }
}