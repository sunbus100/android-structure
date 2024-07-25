package com.example.new_kuangjia.utils.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    long insert(MyEntity entity);

    @Query("SELECT * FROM my_table WHERE id = :id")
    MyEntity getById(long id);

    @Update
    int update(MyEntity entity);

    @Delete
    int delete(MyEntity entity);

    @Query("SELECT * FROM my_table")
    List<MyEntity> getAll();
}
