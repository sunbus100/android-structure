package com.example.new_kuangjia.utils.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "my_table")
public class MyEntity {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;
    public int age;

    // 构造函数和getters/setters方法可以根据需要添加
}
