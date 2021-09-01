package com.example.taskmaster.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import java.util.List;

@Dao
public interface DishDao {
    @Insert
    void insertAll(Dish... dishes);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertUsers(Dish... dishes);

    @Delete
    void delete(Dish dish);

    @Query("SELECT * FROM dish")
    List<Dish> getAll();

}
