package com.example.psstasks.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "projects")
public class Project {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String name;

    public Project(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
