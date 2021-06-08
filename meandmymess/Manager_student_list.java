package com.example1.anirbandutta.meandmymess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager_student_list extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> productList;
    int kd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_student_list);
        getSupportActionBar().setTitle("Registered Student List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        productList = new ArrayList<>();

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        EditText editText = findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                filter(s.toString());
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "ANIRBAN DUTTA",
                        "19BCB0015",
                        "F-213",
                        "VEG",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "KUMAR SPARSH",
                        "19BCB0025",
                        "B-232",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "KALIDINDI PAVAN TEJA VARMA",
                        "19BCB0026",
                        "H-338",
                        "VEG",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "AVNISH TIWARI",
                        "19BCE0634",
                        "L-351",
                        "PAID",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "BIPUL BAINWAR",
                        "19BCE2636",
                        "D-521",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "HARSH GULATI",
                        "19BCT0210",
                        "F-452",
                        "NON VEG",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "ANISH KHANNA",
                        "19BCI0108",
                        "K-231",
                        "PAID",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "LAKSHIT KOTHARI",
                        "19BDS0077",
                        "P-213",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "ISHAN TIWARI",
                        "19BDS0071",
                        "P-513",
                        "NON VEG",
                        R.drawable.student123));

        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);

        }
   private void filter(String text)
   {
       ArrayList<Product> filteredList = new ArrayList<>();

       for(Product item : productList)
       {
           if(item.getRegno().toLowerCase().contains(text.toLowerCase()))
           {
               filteredList.add(item);
           }
       }
       adapter.filterlist(filteredList);
   }


}


