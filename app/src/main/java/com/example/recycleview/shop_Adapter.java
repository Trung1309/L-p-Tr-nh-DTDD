package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class shop_Adapter extends RecyclerView.Adapter<shop_Adapter.shopViewHolder> {

    private List<shop_model> list_shop;

    @NonNull
    @Override
    public shopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new shopViewHolder(view);
    }

    public shop_Adapter(List<shop_model> list_shop) {
        this.list_shop = list_shop;
    }

    @Override
    public void onBindViewHolder(@NonNull shopViewHolder holder, int position) {
        shop_model shopModel = list_shop.get(position);
        if (shopModel == null){
            return;
        }

        holder.img.setImageResource(shopModel.getImg());
        holder.txtName.setText(shopModel.getName());
    }

    @Override
    public int getItemCount() {
        if (list_shop != null){
            return list_shop.size();
        }
        return 0;
    }

    public class shopViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView txtName;

        public shopViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_avt);
            txtName = itemView.findViewById(R.id.txt_name);
        }
    }
}
