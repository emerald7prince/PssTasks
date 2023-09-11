package com.example.psstasks;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.psstasks.dao.ProjectDao;
import com.example.psstasks.dao.TaskDao;
import com.example.psstasks.entities.Project;
import com.example.psstasks.entities.Task;

@Database(entities = {Project.class, Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase instance;
    public abstract ProjectDao projectDao();
    public abstract TaskDao taskDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if(instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static AppDatabase create(final Context context) {
        return Room.databaseBuilder(
                        context,
                        AppDatabase.class,
                        "db")
                .build();
    }
}
