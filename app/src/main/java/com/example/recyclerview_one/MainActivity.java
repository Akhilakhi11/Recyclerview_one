package com.example.recyclerview_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.recyclerview_one.adapters.MyAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    String monthName[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december",
            "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
    //public Object MyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, monthName);
        recyclerView.setAdapter(myAdapter);
    }
}



//        MyAdapter = new LinearLayoutManager(this);
//        MyAdapter = new MyAdapter(this,monthName);
//        recyclerView.setAdapter((RecyclerView.Adapter) MyAdapter);
        



