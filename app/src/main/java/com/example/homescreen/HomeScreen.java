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
                "Informatica  03-12-18", "Technische informatica  03-12-18", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies", "Informatica", "Technische informatica", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies", "Informatica", "Technische informatica", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies"
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
                if (position==2) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==3) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==4) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==5) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==6) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==7) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==8) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==9) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==10) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==11) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==12) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==13) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==14) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });



        }







    }

    //http://www.worldbestlearningcenter.com/tips/Android-ListView-item-and-button-clickable.htm
    //https://www.youtube.com/watch?v=UlUwi5EMspc

