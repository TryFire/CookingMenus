package com.example.function.cookingmenus.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.function.cookingmenus.R;

/**
 * Created by function on 2016/2/19.
 */
public class MenuSimpleAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MenuSimpleViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;
        TextView tvImtro;
        ImageView ivAlbum;

        public MenuSimpleViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.menu_simple_title);
            tvImtro = (TextView) itemView.findViewById(R.id.menu_simple_imtro);
            ivAlbum = (ImageView) itemView.findViewById(R.id.menu_simple_album);
        }
    }
}
