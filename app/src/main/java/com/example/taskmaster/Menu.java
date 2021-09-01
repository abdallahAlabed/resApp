package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.taskmaster.database.AppDatabase;
import com.example.taskmaster.database.Dish;
import com.example.taskmaster.database.DishDao;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {
    AppDatabase db ;
    DishDao dishDao ;
    ArrayList<Dish> dishes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        db =  Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "res-app").allowMainThreadQueries()
                .build();
        dishDao = db.dishesDao();

         dishes = (ArrayList<Dish>) dishDao.getAll();
        RecyclerView dishModelRecuclerView = findViewById(R.id.menus);
        dishModelRecuclerView.setLayoutManager(new LinearLayoutManager(this));
        dishModelRecuclerView.setAdapter(new DishAdaptear(dishes));

        Button home = findViewById(R.id.homebutt);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHome = new Intent(Menu.this, MainActivity.class);
                startActivity(goToHome);
            }
        });
    }

}