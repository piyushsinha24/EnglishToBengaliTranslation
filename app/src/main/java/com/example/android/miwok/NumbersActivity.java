package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.media.MediaPlayer;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("One", "Ēka", R.drawable.number_one,R.raw.number_one));
        words.add(new word("Two", "Du'i", R.drawable.number_two,R.raw.number_two));
        words.add(new word("Three", "Tina", R.drawable.number_three,R.raw.number_three));
        words.add(new word("Four", "Cāra", R.drawable.number_four,R.raw.number_four));
        words.add(new word("Five", "Pām̐ca", R.drawable.number_five,R.raw.number_five));
        words.add(new word("Six", "Chaẏa", R.drawable.number_six,R.raw.number_six));
        words.add(new word("Seven", "Sāta", R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("Eight", "ata", R.drawable.number_eight, R.raw.number_eight));
        words.add(new word("Nine", "Naẏa", R.drawable.number_nine,R.raw.number_nine));
        words.add(new word("Ten", "Daśa", R.drawable.number_ten,R.raw.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordadapter adapter = new wordadapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // words_list.xmlt file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
              word w =  words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this,w.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}