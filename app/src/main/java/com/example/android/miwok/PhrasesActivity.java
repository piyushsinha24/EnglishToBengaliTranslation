package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Create a list of words
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Good morning", "Suprabhāta"));
        words.add(new word("Good Afternoon", "Śubha aparāhna"));
        words.add(new word("Good Night", "Śubha rātri"));
        words.add(new word("How are you?", "\n" +
                "Āpani kēmana āchēna"));
        words.add(new word("I am fine", "Āmi bhālō āchi"));
        words.add(new word("Good Night", "Śubha rātri"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordadapter adapter= new wordadapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // words_list.xmlt file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

