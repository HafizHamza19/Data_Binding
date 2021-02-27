package com.hafizhamza.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hafizhamza.data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setData(new DataModelClass("Hafiz Hamza"));
        binding.setActivity(new MainActivity());
    }
    public void click(View view,String msg)
    {
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
