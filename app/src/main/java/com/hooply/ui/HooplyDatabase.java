package com.hooply.ui;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class,Comments.class,Posts.class},version = 1)
public abstract class HooplyDatabase extends RoomDatabase
{
    public abstract MyDao myDao();
}
