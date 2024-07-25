package com.example.new_kuangjia.ui.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.new_kuangjia.R;
import com.example.new_kuangjia.data.model.User;
import com.example.new_kuangjia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewModel(mainViewModel);
        binding.setLifecycleOwner(this);

        mainViewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                // 更新UI
            }
        });

        binding.updateButton.setOnClickListener(v -> {
            String name = binding.userNameEditText.getText().toString();
            int age = Integer.parseInt(binding.userAgeEditText.getText().toString());
            mainViewModel.updateUser(name, age);
        });
    }
}
