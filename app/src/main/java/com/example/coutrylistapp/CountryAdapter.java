package com.example.coutrylistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends ArrayAdapter<Country> {
    public CountryAdapter(Context context, ArrayList<Country> countries){

    super(context,0,countries);

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        Country selectedCountry = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_country,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.imgFlag);
        TextView tvName = convertView.findViewById(R.id.tvCountryName);
        TextView tvCapital = convertView.findViewById(R.id.tvCountryCapital);

        imageView.setImageResource(selectedCountry.imageResId);
        tvName.setText(selectedCountry.nameResId);
        tvCapital.setText(selectedCountry.capitalResId);

        return convertView;
    }
}
