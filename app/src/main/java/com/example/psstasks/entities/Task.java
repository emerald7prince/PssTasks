package com.example.psstasks.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tasks")
public class Task {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String name;
    @ColumnInfo(name = "project_id")
    private long projectId;

    public Task(String name, long projectId) {
        setName(name);
        setProjectId(projectId);
    }

    public String getName() {
        return name;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }
}
