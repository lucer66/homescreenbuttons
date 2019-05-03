package com.example.homescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Studies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studies);

        Button informaticaBtn = findViewById(R.id.informaticaClick);
        Button techInformaticaBtn = findViewById(R.id.techinformaticaClick);
        Button communicationBtn = findViewById(R.id.communicationClick);

        informaticaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInformaticaPage();
            }

        });

        techInformaticaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTechInformaticaPage();

            }
        });

        communicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommunicationPage();

            }
        });
    }
    public void openInformaticaPage(){
        Intent intent = new Intent(this, InformaticaPage.class);
        startActivity(intent);
    }

    public void openTechInformaticaPage(){
        Intent intent1 = new Intent(this, TechInformaticaPage.class);
        startActivity(intent1);
    }

    public void openCommunicationPage() {
        Intent intent2 = new Intent(this, CommunicationPage.class);
        startActivity(intent2);


    }}