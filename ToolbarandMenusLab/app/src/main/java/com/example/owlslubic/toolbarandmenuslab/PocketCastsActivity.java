package com.example.owlslubic.toolbarandmenuslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PocketCastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocket_casts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.podcast_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" ");



        ImageButton hamburger = (ImageButton) findViewById(R.id.hamburger);
        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PocketCastsActivity.this, "This goes to the navigation drawer! There are no hamburgers in there.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pocketcasts_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cast:
                Toast.makeText(PocketCastsActivity.this, "Send it to the big screen!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.add:
                Toast.makeText(PocketCastsActivity.this, "Add a new podcast!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.three_dots:
                Toast.makeText(PocketCastsActivity.this, "This is your overflow menu!", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
