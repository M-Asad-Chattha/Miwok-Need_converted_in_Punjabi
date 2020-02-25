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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows Numbers category
        TextView numbers = findViewById(R.id.numbers);
        //Add onClickListener to respond onClick events.
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find the view that shows phrases category
        TextView phrases = findViewById(R.id.phrases);
        //Add onClickListener to respond onClick events.
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //Start the new activity
                startActivity(phrasesIntent);
            }
        });

        //Find the view that shows colors category
        TextView colors = findViewById(R.id.colors);
        //Add onClickListener to respond onClick events.
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the view that shows family category
        TextView family = findViewById(R.id.family);
        //Add onClickListener to respond onClick events.
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                //Start the new activity
                startActivity(familyIntent);
            }
        });
    }

    public void openPhrasesActivity(View view) {
        Intent phrasesIntent = new Intent(this, PhrasesActivity.class);
        startActivity(phrasesIntent);
    }

    public void openFamilyActivity(View view) {
        Intent familyIntent = new Intent(this, FamilyActivity.class);
        startActivity(familyIntent);
    }

    public void openNumbersActivity(View view) {
        Intent numbersIntent = new Intent(this, NumbersActivity.class);
        startActivity(numbersIntent);
    }

    public void openColorsActivity(View view) {
        Intent colorsIntent = new Intent(this, ColorsActivity.class);
        startActivity(colorsIntent);
    }
}
