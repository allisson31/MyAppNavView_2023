package com.example.myappnavview_2023;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.topAppBar);
        toolbar.setTitle("UTEQ APP");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mnuAgregar){
            Toast.makeText(this.getApplicationContext(), "Nuevo", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.mnuBuscar){
            Toast.makeText(this.getApplicationContext(), "Buscar", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.mnuSettings){
            Toast.makeText(this.getApplicationContext(), "Settings", Toast.LENGTH_LONG).show();
        }
        else
            return super.onOptionsItemSelected(item);

        return true;
    }

    public void on_floating_button_click(View view){
        Snackbar.make(view, "Se presionò el FAB", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

}