package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Create a list of words
       final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Grandfather", "Pitāmaha",R.drawable.family_grandfather,R.raw.number_one));
        words.add(new word("Grandmother", "Nānī",R.drawable.family_grandmother,R.raw.number_one));
        words.add(new word("Father", "Pitā",R.drawable.family_father,R.raw.number_one));
        words.add(new word("Mother", "Mā",R.drawable.family_mother,R.raw.number_one));
        words.add(new word("Elder Sister", "Baṛa bōna",R.drawable.family_older_sister,R.raw.number_one));
        words.add(new word("Elder Brother", "Baṛa bhā'i",R.drawable.family_older_brother,R.raw.number_one));
        words.add(new word("Son", "Putra",R.drawable.family_son,R.raw.number_one));
        words.add(new word("Daughter", "Kan'yā",R.drawable.family_daughter,R.raw.number_one));
        words.add(new word("Uncle", "Cācā",R.drawable.family_father,R.raw.number_one));
        words.add(new word("Aunt", "Māsi",R.drawable.family_mother,R.raw.number_one));
        words.add(new word("Younger Brother", "Chōṭa bhā'i",R.drawable.family_younger_brother,R.raw.number_one));
        words.add(new word("Younger Sister", "Chōṭa bōna",R.drawable.family_younger_sister,R.raw.number_one));

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
                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this,w.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
