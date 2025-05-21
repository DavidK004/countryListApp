package com.example.coutrylistapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CountryDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_country_details);
        ImageView ivFlag = findViewById(R.id.ivFlag);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvDesc = findViewById(R.id.tvDesc);

        Intent intent = getIntent();
        if(intent != null){
            ivFlag.setImageResource(intent.getIntExtra("flag",0));
            tvName.setText(intent.getIntExtra("name",0));
            tvDesc.setText(intent.getIntExtra("desc",0));
        }
    }
}