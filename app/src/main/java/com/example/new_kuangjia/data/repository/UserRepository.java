package com.example.new_kuangjia.data.repository;

import androidx.lifecycle.MutableLiveData;
import com.example.new_kuangjia.data.model.User;

public class UserRepository {
    private MutableLiveData<User> user = new MutableLiveData<>();

    public UserRepository() {
        // 初始化用户数据
        user.setValue(new User("John Doe", 25));
    }

    public MutableLiveData<User> getUser() {
        return user;
    }

    public void updateUser(String name, int age) {
        user.setValue(new User(name, age));
    }
}

