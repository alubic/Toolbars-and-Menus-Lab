package com.example.owlslubic.toolbarandmenuslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class TEDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ted_toolbar);
        setSupportActionBar(toolbar);

        ImageButton home = (ImageButton) findViewById(R.id.home_arrow);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TEDActivity.this, "I'd take you home, but I don't know where you live! So I'll take you to a different activity!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TEDActivity.this, PocketCastsActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ted_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_share:
                Toast.makeText(TEDActivity.this, "Sharing is caring!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_bookmark:
                Toast.makeText(TEDActivity.this, "This is supposed to be a bookmark but I couldn't find the right icon!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_download:
                Toast.makeText(TEDActivity.this, "download", Toast.LENGTH_SHORT).show();
                return true;



        }


        return super.onOptionsItemSelected(item);
    }
}

//getsupportactionbar.settitle
