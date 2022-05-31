package com.example.countrylist;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView textView;
    ImageView flag;
    ImageView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Intent intent = getIntent();

        textView = findViewById(R.id.detail_info);
        flag = findViewById(R.id.detail_flag);
        map = findViewById(R.id.detail_map);

        //Glide.with(this).load(intent.getStringExtra("flag")).into(flag);
        //Glide.with(this).load(intent.getStringExtra("flag")).into(flag);

    }
}
