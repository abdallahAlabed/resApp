package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.taskmaster.database.AppDatabase;
import com.example.taskmaster.database.Dish;
import com.example.taskmaster.database.DishDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addDish = findViewById(R.id.addDish);
        addDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addDish = new Intent(MainActivity.this, Dishs.class);
                startActivity(addDish);

            }
        });
        Button menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMenu = new Intent(MainActivity.this, Menu.class);
                startActivity(goToMenu);
            }
        });


    }



}
