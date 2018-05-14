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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
//        String [] words = new String[10];
//        words[0]="one";
//        words[1]="two";
//        words[2]="three";
//        words[3]="four";
//        words[4]="five";
//        words[5]="six";
//        words[6]="seven";
//        words[7]="eight";
//        words[8]="nine";
//        words[9]="ten";

        ArrayList<String> words = new ArrayList<String>();
        words.add(0,"one");
        words.add(1,"two");
        words.add(2,"three");
        words.add(3,"four");
        words.add(4,"five");
        words.add(5,"six");
        words.add(6,"seven");
        words.add(7,"eight");
        words.add(8,"nine");
        words.add(9,"ten");

//        Log.v("NumbersActivity","word at index 0: "+words[0]);
//        Log.v("NumbersActivity","word at index 1: "+words[1]);

        Log.v("Numbers","words at 0 " + words.get(0));
        Log.v("Numbers","words at 1" + words.get(1));

        LinearLayout rootview = (LinearLayout)findViewById(R.id.rootview);
//        TextView wordview = new TextView(this);
//        wordview.setText(words.get(0));
//        rootview.addView(wordview);
//
//        TextView wordview2 = new TextView(this);
//        wordview2.setText(words.get(1));
//        rootview.addView(wordview2);

        for(int i=0;i<10;i++)
        {
            TextView wordview2 = new TextView(this);
            wordview2.setText(words.get(i));  // adding data to the textView
            rootview.addView(wordview2); // displaying the text view
            Log.v("NumbersActivity", "Index:" + i+1 + " Value:" + words.get(i));


        }
       // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
       // ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
      //  ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
      //  listView.setAdapter(itemsAdapter);
    }
}
