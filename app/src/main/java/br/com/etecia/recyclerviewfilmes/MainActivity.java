package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Jogadoras> listaFilmes;

    //Declarar o recycler view
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idjogadoras);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Jogadoras("leon",
                        "manchester United",
                        "copa Algarve",
                        R.drawable.leon));
        listaFilmes.add(
                new Jogadoras("O Apocalipe",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.alisha));
        listaFilmes.add(
                new Jogadoras("2067",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.huitema));
        listaFilmes.add(
                new Jogadoras("Medo Profundo",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.pop));
        listaFilmes.add(
                new Jogadoras("A Menina",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.putellas));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.lucy));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.san));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.aslani));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.vicki));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.lauren));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.caicedo));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.ada));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.carli));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.aslani));

        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.mateo));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.markovik));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.swaby));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.morgan));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.marta));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.debs));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.megan));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.kealia));
        listaFilmes.add(
                new Jogadoras("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.havana));















        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //Tipo de layout de a lista irá seguir
        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar a lista mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}