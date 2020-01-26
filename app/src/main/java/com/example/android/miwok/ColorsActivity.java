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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>(10);
        words.add(new Word("weṭeṭṭi", "red", R.drawable.color_red, MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("chokokki", "green", R.drawable.color_green, MediaPlayer.create(this, R.raw.color_green)));
        words.add(new Word("ṭakaakki", "brown", R.drawable.color_brown, MediaPlayer.create(this, R.raw.color_brown)));
        words.add(new Word("ṭopoppi", "gray", R.drawable.color_gray, MediaPlayer.create(this, R.raw.color_gray)));
        words.add(new Word("kululli", "black", R.drawable.color_black, MediaPlayer.create(this, R.raw.color_black)));
        words.add(new Word("kelelli", "white", R.drawable.color_white, MediaPlayer.create(this, R.raw.color_white)));
        words.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, MediaPlayer.create(this, R.raw.color_dusty_yellow)));
        words.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, MediaPlayer.create(this, R.raw.color_mustard_yellow)));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);
    }
}
