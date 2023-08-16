package br.com.etecia.recyclerviewfilmes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Jogadoras> lstJogadoras;

    //criando o construtor da classe com parâmetros


    public MyAdapter(Context mContexto, List<Jogadoras> lstjogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstjogadoras;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.idjogadoras.setText(lstJogadoras.get(position).getTitulo());
        holder.idImgJog.setImageResource(lstJogadoras.get(position).getImagem());

        holder.idCardJogdaras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaFilmeActivity.class);

                intent.putExtra("nome", lstJogadoras.get(position).getTitulo());
                intent.putExtra("titulos", lstJogadoras.get(position).getDescricao());
                intent.putExtra("Times", lstJogadoras.get(position).getCategoria());
                intent.putExtra("posiçao", lstJogadoras.get(position).getImagem());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });

    }

    @Override
    public int getItemCount() {
        return lstJogadoras.size();
    }

    //criar a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idjogadoras;
        ImageView idImgJog;
        CardView idCardJogdaras;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idjogadoras = itemView.findViewById(R.id.idjogadoras);
            idImgJog = itemView.findViewById(R.id.idImgJog);
            idCardJogdaras = itemView.findViewById(R.id.idCardJogdaras);
        }
    }
}
