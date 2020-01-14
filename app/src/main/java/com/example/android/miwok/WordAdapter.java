package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView textView = listItemView.findViewById(R.id.miwok_item);
        textView.setText(currentWord.getMiwokTranslation());

        textView = listItemView.findViewById(R.id.english_item);
        textView.setText(currentWord.getDefaulTranslation());

        LinearLayout linearLayout = listItemView.findViewById(R.id.word_wrapper);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        linearLayout.setBackgroundColor(color);

        ImageView imageView = listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResorceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
