package com.example.homescreen;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        String[] values = new String[]{
                "Informatica", "Technische informatica", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies", "Item6", "Item7"
        };

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        final ListView listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
                if(position==0){
                    Intent myIntent = new Intent(view.getContext(), InformaticaOpendag.class);
                    startActivityForResult(myIntent, 0 );
                }
                if (position==1){
                Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                startActivityForResult(myIntent,0);
                }
            }
        });



        }







    }

    //http://www.worldbestlearningcenter.com/tips/Android-ListView-item-and-button-clickable.htm
    //https://www.youtube.com/watch?v=UlUwi5EMspc

