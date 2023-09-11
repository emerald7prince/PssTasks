package com.example.psstasks.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.psstasks.entities.Project;

import java.util.List;

@Dao
public interface ProjectDao {

    @Query("SELECT * FROM projects")
    List<Project> getAll();

    @Query("SELECT * FROM projects WHERE id = :id")
    Project getById(long id);

    @Query("DELETE FROM projects")
    void deleteAll();

    @Insert
    long insert(Project project);

    @Update
    void update(Project project);

    @Delete
    void delete(Project project);
}
