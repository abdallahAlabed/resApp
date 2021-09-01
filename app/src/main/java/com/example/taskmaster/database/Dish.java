package com.example.taskmaster.database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "price")
    public String price;

    @ColumnInfo(name = "ingredients")
    public String ingredients;

    public Dish(String name, String price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
}


