package com.hexagonsi.jmalek.buttondatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.hexagonsi.jmalek.buttondatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static ButtonModel buttonModel = new ButtonModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.inflate(LayoutInflater.from(this),
                R.layout.activity_main, null, false);
        binding.setButtonModel(buttonModel);
        setContentView(binding.getRoot());
    }
}
