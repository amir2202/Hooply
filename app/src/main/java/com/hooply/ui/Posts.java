package com.hooply.ui;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Posts")
public class Posts {

    @PrimaryKey(autoGenerate = true)
    private int id;




}
