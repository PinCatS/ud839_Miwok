/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>(10);
        words.add(new Word("minto wuksus", "Where are you going?", -1, MediaPlayer.create(this, R.raw.phrase_where_are_you_going)));
        words.add(new Word("tinnә oyaase'nә", "What is your name?", -1, MediaPlayer.create(this, R.raw.phrase_what_is_your_name)));
        words.add(new Word("oyaaset...", "My name is...", -1, MediaPlayer.create(this, R.raw.phrase_my_name_is)));
        words.add(new Word("michәksәs?", "How are you feeling?", -1, MediaPlayer.create(this, R.raw.phrase_how_are_you_feeling)));
        words.add(new Word("kuchi achit", "I’m feeling good.", -1, MediaPlayer.create(this, R.raw.phrase_im_feeling_good)));
        words.add(new Word("әәnәs'aa?", "Are you coming?", -1, MediaPlayer.create(this, R.raw.phrase_are_you_coming)));
        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming.", -1, MediaPlayer.create(this, R.raw.phrase_im_coming)));
        words.add(new Word("әәnәm", "I’m coming.", -1, MediaPlayer.create(this, R.raw.phrase_yes_im_coming)));
        words.add(new Word("yoowutis", "Let’s go.", -1, MediaPlayer.create(this, R.raw.phrase_lets_go)));
        words.add(new Word("әnni'nem", "Come here.", -1, MediaPlayer.create(this, R.raw.phrase_come_here)));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);
    }
}
