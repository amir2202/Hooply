package com.hooply.ui;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Timestamp;

@Entity
public class User {
    @PrimaryKey
    private String userid;

    @ColumnInfo(name="name")
    private String fullName;

    @ColumnInfo(name="timestamp")
    private Timestamp stamp;

}
