package com.example.menu_practice_multipleactivities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class Menu extends ListActivity {

    String classes[] = {"MainActivity", "activity_2", "activity_3", "activity_4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);


        String container = classes[position];

        try {

        Class ourClass = Class.forName("com.example.menu_practice_multipleactivities." + container);
        Intent ourIntent= new Intent(Menu.this, ourClass);
        startActivity(ourIntent);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}
