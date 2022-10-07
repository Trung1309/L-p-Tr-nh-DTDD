package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    String[] name = {"Áo khoác","Áo Polo", "Áo thun", "Quần jean", "Quần Tây", "Quần Short"};
    int[] img = {R.drawable.aokhoac,R.drawable.aopolo,R.drawable.aothun,R.drawable.quanjean,
            R.drawable.quantay,R.drawable.quanshort};
    private RecyclerView recyclerView;
    private shop_Adapter shopAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcv_shop);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        shopAdapter = new shop_Adapter(getList_Shop());
        recyclerView.setAdapter(shopAdapter);
    }

    private List<shop_model> getList_Shop() {
        ArrayList arrayList = new ArrayList();
        for (int i =0 ; i<img.length;i++){
            shop_model shopModel = new shop_model(name[i],img[i]);
            arrayList.add(shopModel);
        }
        return arrayList;
    }


}