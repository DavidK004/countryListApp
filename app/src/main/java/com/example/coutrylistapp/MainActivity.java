package com.example.coutrylistapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView countryList = findViewById(R.id.lvCountry);
        ArrayList<Country> countries = new ArrayList<Country>();

        countries.add(new Country(
                R.string.serbia_name,
                R.string.serbia_capital,
                R.string.serbia_desc,
                R.drawable.serbia));

        countries.add(new Country(
                R.string.japan_name,
                R.string.japan_capital,
                R.string.japan_desc,
                R.drawable.japan));

        countries.add(new Country(
                R.string.canada_name,
                R.string.canada_capital,
                R.string.canada_desc,
                R.drawable.canada));

        countries.add(new Country(
                R.string.brazil_name,
                R.string.brazil_capital,
                R.string.brazil_desc,
                R.drawable.brazil));

        countries.add(new Country(
                R.string.egypt_name,
                R.string.egypt_capital,
                R.string.egypt_desc,
                R.drawable.egypt));

        countries.add(new Country(
                R.string.australia_name,
                R.string.australia_capital,
                R.string.australia_desc,
                R.drawable.australia));

        countries.add(new Country(
                R.string.denmark_name,
                R.string.denmark_capital,
                R.string.denmark_desc,
                R.drawable.denmark));

        CountryAdapter adapter = new CountryAdapter(this,countries);
        countryList.setAdapter(adapter);

        countryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Country selectedCountry = countries.get(i);
                Intent intent = new Intent(MainActivity.this,CountryDetailsActivity.class);
                intent.putExtra("name",selectedCountry.nameResId);
                intent.putExtra("flag",selectedCountry.imageResId);
                intent.putExtra("desc",selectedCountry.descResId);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}