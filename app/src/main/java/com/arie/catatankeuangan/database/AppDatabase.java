package com.arie.catatankeuangan.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.arie.catatankeuangan.database.dao.DatabaseDao;
import com.arie.catatankeuangan.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
