package com.example.new_kuangjia.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.new_kuangjia.data.model.User;
import com.example.new_kuangjia.data.repository.UserRepository;

public class MainViewModel extends ViewModel {
    private UserRepository userRepository;
    private MutableLiveData<User> user;

    public MainViewModel() {
        userRepository = new UserRepository();
        user = userRepository.getUser();
    }

    public LiveData<User> getUser() {
        return user;
    }

    public void updateUser(String name, int age) {
        userRepository.updateUser(name, age);
    }
}

