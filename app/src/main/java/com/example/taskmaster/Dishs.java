package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.taskmaster.database.AppDatabase;
import com.example.taskmaster.database.Dish;
import com.example.taskmaster.database.DishDao;

public class Dishs extends AppCompatActivity {
    AppDatabase db ;
    DishDao dishDao ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_dishs);
        db =  Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "res-app").allowMainThreadQueries().build();
        dishDao = db.dishesDao();
        EditText dishName = findViewById(R.id.dishName);
        EditText price = findViewById(R.id.price);
        EditText ingredients= findViewById(R.id.ingredients);

        Button menu = findViewById(R.id.submit);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishDao.insertUsers(new Dish(dishName.getText().toString(),price.getText().toString(),ingredients.getText().toString()));
                Toast.makeText(getApplicationContext(), "hallelooya!", Toast.LENGTH_LONG).show();
                Intent goToMenu = new Intent(Dishs.this, Menu.class);
                startActivity(goToMenu);

            }
        });





}}