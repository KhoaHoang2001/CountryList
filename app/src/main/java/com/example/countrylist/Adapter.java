package com.example.countrylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Country> {

    ArrayList<Country> countries;
    Context context;
    int resource;

    public Adapter(@NonNull Context context, int resource,ArrayList<Country> countries) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.countries = countries;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource,null);
        TextView countryName = convertView.findViewById(R.id.country_name);
        ImageView countryFlag = convertView.findViewById(R.id.country_flag);

        countryName.setText(countries.get(position).getCountryName());
        Glide.with(context).load(countries.get(position).getCountryFlag()).into(countryFlag);

        return super.getView(position, convertView, parent);
    }
}
