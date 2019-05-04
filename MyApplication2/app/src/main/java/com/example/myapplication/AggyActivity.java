package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AggyActivity extends AppCompatActivity {
    String[] myname={
            "Cake","Tea",
            "Milk","bread",
            "rice","peas",
            "fish","patatos",
    };
    String[] subname ={
            "price.......5000",
            "price.......5000",
            "price.......5000",
            "price.......5000",
            "price.......5000",
            "price.......4500",
            "price.......3500",
            "price.......3000",
    }
    ;
    Integer[] imgid={
            R.drawable.cake,
            R.drawable.fish,
            R.drawable.food1,
            R.drawable.tea,
            R.drawable.milk,
            R.drawable.food2,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggy);
        MyListView.MyListAdapter adapter=new MyListView.MyListAdapter(this, myname, subname,imgid);
        ListView list =(ListView)findViewById(R.id.ice);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }}


