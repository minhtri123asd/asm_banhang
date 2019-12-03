package com.example.asm_sale.Adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.asm_sale.Model.PRODUCT;
import com.example.asm_sale.R;

import java.util.ArrayList;
import java.util.List;


public class ProductAdapter extends BaseAdapter {
    private Context mcontext;
    private ArrayList<PRODUCT> mProduct;
    RequestOptions option;

    public ProductAdapter(Context mcontext, ArrayList<PRODUCT> mProduct) {
        this.mcontext = mcontext;
        this.mProduct = mProduct;

        // request option for Glide
        option= new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }


    @Override
    public int getCount() {
        return mProduct.size();
    }

    @Override
    public Object getItem(int i) {
        return mProduct.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class ProductHolder {
        TextView tv_namepro,tv_pricepro,tv_despro;
        ImageView img_pro;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ProductHolder holder;
        if (view == null) {
            holder = new ProductHolder();
            LayoutInflater inflater = ((Activity) mcontext).getLayoutInflater();
            view = inflater.inflate(R.layout.item_product, null);
//            holder.tv_id    = view.findViewById(R.id.textView2);
            holder.tv_namepro = view.findViewById(R.id.tv_nameproduct);
            holder.tv_pricepro = view.findViewById(R.id.tv_priceproduct);
            holder.tv_despro = view.findViewById(R.id.tv_description);
            holder.img_pro = view.findViewById(R.id.img_product);
            view.setTag(holder);


        } else {
            holder = (ProductHolder) view.getTag();
        }
        final PRODUCT showPro = mProduct.get(i);
        holder.tv_namepro.setText(showPro.getNameproduct());
        holder.tv_pricepro.setText(showPro.getPriceproduct());
        holder.tv_despro.setText(showPro.getDescription());
        holder.img_pro.setImageURI(Uri.parse(""));

        return view;
    }
}
