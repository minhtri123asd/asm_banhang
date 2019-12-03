package com.example.asm_sale.Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.asm_sale.Adapter.ProductAdapter;
import com.example.asm_sale.Model.PRODUCT;
import com.example.asm_sale.R;
import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;


import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;
import java.util.ArrayList;



public class ProductsActivity extends AppCompatActivity {
     ListView lv_pro;
     ArrayList<PRODUCT> products = new ArrayList<>();
     ProductAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);


        lv_pro = findViewById(R.id.lv_product);

        adapter = new ProductAdapter(ProductsActivity.this,products);
        products.add(new PRODUCT("tao","20k","macvl","chưa có"));
        lv_pro.setAdapter(adapter);


    }
}
