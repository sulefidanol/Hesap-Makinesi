package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.hesapmakinesi.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.button1.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button1.getText());
        });
        binding.button2.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button2.getText());
        });
        binding.button3.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button3.getText());
        });
        binding.button4.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button4.getText());
        });
        binding.button5.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button5.getText());
        });
        binding.button6.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button6.getText());
        });
        binding.button7.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button7.getText());
        });
        binding.button8.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button8.getText());
        });
        binding.button9.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.button9.getText());
        });
        binding.buttonTemizle.setOnClickListener(v->{
            binding.editTextText2.setText("");
        });
        binding.buttonToplama.setOnClickListener(v->{
            binding.editTextText2.setText(binding.editTextText2.getText().toString()+binding.buttonToplama.getText());
        });
        binding.buttonHesapla.setOnClickListener(v->{
            String[] al = binding.editTextText2.getText().toString().split("\\+");
            int[] dizi = new int[al.length];
            for(int i=0;i<al.length;i++){
                dizi[i] = Integer.parseInt(al[i].trim());
            }
            int toplam= 0;
            for (int i =0; i<dizi.length;i++){
                toplam += dizi[i];
            }
            binding.editTextText2.setText(String.valueOf(toplam));
        });




    }
}