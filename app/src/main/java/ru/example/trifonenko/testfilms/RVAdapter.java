package ru.example.trifonenko.testfilms;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.FilmsViewHolder> {

    public static class FilmsViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView nameRus;
        TextView nameEng;
        TextView rating;

        FilmsViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            nameRus = (TextView)itemView.findViewById(R.id.name_rus);
            nameEng = (TextView)itemView.findViewById(R.id.name_eng);
            rating = (TextView)itemView.findViewById(R.id.rating);
        }
    }

    List<Films> films;

    RVAdapter(List<Films> films){
        this.films = films;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public FilmsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        FilmsViewHolder pvh = new FilmsViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(FilmsViewHolder filmsViewHolder, int i) {
        filmsViewHolder.nameRus.setText(films.get(i).namerus);
        filmsViewHolder.nameEng.setText(films.get(i).nameeng);
        filmsViewHolder.rating.setText(films.get(i).rating);
    }

    @Override
    public int getItemCount() {
        return films.size();
    }
}
