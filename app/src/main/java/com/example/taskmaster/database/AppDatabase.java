package com.example.taskmaster.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Dish.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DishDao dishesDao();
}