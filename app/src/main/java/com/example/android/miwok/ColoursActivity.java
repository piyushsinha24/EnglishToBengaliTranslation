package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Red", "Lāla",R.drawable.color_red,R.raw.number_one));
        words.add(new word("Brown", "Bādāmī",R.drawable.color_brown,R.raw.number_one));
        words.add(new word("Yellow", "Haluda",R.drawable.color_mustard_yellow,R.raw.number_one));
        words.add(new word("Black", "Kālō",R.drawable.color_black,R.raw.number_one));
        words.add(new word("Green", "Sabuja",R.drawable.color_green,R.raw.number_one));
        words.add(new word("White", "Sādā",R.drawable.color_white,R.raw.number_one));
        words.add(new word("Gray", "Dhūsara",R.drawable.color_gray,R.raw.number_one));


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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                word w =  words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(ColoursActivity.this,w.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}


