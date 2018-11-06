package ru.example.trifonenko.testfilms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Films> films;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

    }

    private void initializeData(){
        films = new ArrayList<>();
        films.add(new Films("Матрица", "Matrica","9,365"));
        films.add(new Films("Гарри Поттер", "Harry Potter","6,369"));
        films.add(new Films("Властелин Колец", "Vlastelin Kolec", "8,265"));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(films);
        rv.setAdapter(adapter);
    }

}
