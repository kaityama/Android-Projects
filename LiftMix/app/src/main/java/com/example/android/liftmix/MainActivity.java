package com.example.android.liftmix;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//    }

//    public void clickable(View View)
//    {
//        String button_text;
//        button_text =((Button)View).getText().toString();
//        if(button_text.equals("Upper Body")) {
//            Intent i = new Intent(this, UpperBodyActivity.class);
//            startActivity(i);
//        }
//    }

        Button numbers = findViewById(R.id.upperbody);
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UpperBodyActivity.class);
                startActivity(intent);
            }
        });
    }
}
