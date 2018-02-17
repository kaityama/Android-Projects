package com.example.android.liftmix;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kaity on 2/15/2018.
 */

public class ExerciseAdapter extends ArrayAdapter<Exercise> {
    private int colorResource;
    ArrayList<Exercise> exerciseItems = null;

    public ExerciseAdapter(Activity context, ArrayList<Exercise> exercises, int color) {
        super(context, 0, exercises);
        this.colorResource = color;
        this.exerciseItems = exercises;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Exercise currentExercise = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mTextView = (TextView) listItemView.findViewById(R.id.exercise_name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        mTextView.setText(currentExercise.getmName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView dTextView = (TextView) listItemView.findViewById(R.id.exercise_description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dTextView.setText(currentExercise.getmDescription());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Word object and
        // set the image to iconView
        iconView.setImageResource(currentExercise.getmImageResourceId());
        iconView.setVisibility(View.VISIBLE);

        View textContainer = listItemView.findViewById(R.id.text_column);
        int color = ContextCompat.getColor(getContext(), colorResource);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
