package com.example.psstasks.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.psstasks.entities.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM tasks WHERE project_id = :project_id")
    List<Task> getAllByProjectId(long project_id);

    @Query("SELECT * FROM tasks WHERE id = :id")
    Task getById(long id);

    @Query("DELETE FROM tasks")
    void deleteAll();

    @Insert
    long insert(Task task);

    @Update
    void update(Task task);

    @Delete
    void delete(Task task);
}
