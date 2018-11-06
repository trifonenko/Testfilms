package ru.example.trifonenko.testfilms;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CardViewActivity extends Activity {

    TextView nameRus;
    TextView nameEng;
    TextView rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cardview_activity);
        nameRus = (TextView)findViewById(R.id.name_rus);
        nameEng = (TextView)findViewById(R.id.name_eng);
        rating = (TextView)findViewById(R.id.rating);

        nameRus.setText("Emma Wilson");
        nameEng.setText("23 years old");
        rating.setText("9.325");
    }
}
