package com.example.android.liftmix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kaity on 1/2/2018.
 */

public class UpperBodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_order);

        final ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(new Exercise("Dumbbell shoulder press", "3 sets x 8-10 reps", R.drawable.upperbody_dbspress));
        exercises.add(new Exercise("Military press", "3 sets x 8-10 reps", R.drawable.upperbody_mpress));
        exercises.add(new Exercise("Push ups", "3 sets x 8-15 reps", R.drawable.upperbody_pushups));
        exercises.add(new Exercise("Bench press", "3 sets x 8-10 reps", R.drawable.upperbody_bpress));
        exercises.add(new Exercise("Incline dumbbell press", "3 sets x 8-10 reps", R.drawable.upperbody_idbpress));
        exercises.add(new Exercise("Dips", "3 sets x 10-12 reps", R.drawable.upperbody_dips));
        exercises.add(new Exercise("Lying dumbbell tricep extension", "3 sets x 6-8 reps", R.drawable.upperbody_ldbtext));

        ExerciseAdapter itemsAdapter = new ExerciseAdapter(this, exercises, R.color.category_upperbody);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        ArrayList<Exercise> selected = new ArrayList<>();

        for (int i = 0; i < exercises.size(); i++) {
            CheckBox c = (CheckBox) listView.getChildAt(i);
            if (c.isChecked()) {
                selected.add(exercises.get(i));
            }
        }

        Button submitForm = findViewById(R.id.submit_exercises);
        // Set a click listener on that View
        submitForm.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UpperBodyActivity.this, ConfirmActivity.class);
                startActivity(intent);
            }
        });
    }
}
