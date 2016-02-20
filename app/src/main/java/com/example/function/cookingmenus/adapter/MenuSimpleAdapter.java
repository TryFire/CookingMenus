package com.example.function.cookingmenus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.function.cookingmenus.R;
import com.example.function.cookingmenus.adapter.item.MenuSimpleItem;
import com.example.function.cookingmenus.utils.AlbumUtil;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by function on 2016/2/19.
 */
public class MenuSimpleAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<MenuSimpleItem> simpleItems;

    public MenuSimpleAdapter(Context context, List<MenuSimpleItem> simpleItems) {
        this.context = context;
        this.simpleItems = simpleItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_menu_simple_item, parent, false);
        MenuSimpleViewHolder viewHolder = new MenuSimpleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MenuSimpleViewHolder) holder).tvTitle.setText(simpleItems.get(position).getTitle());
        ((MenuSimpleViewHolder) holder).tvImtro.setText(simpleItems.get(position).getImtro());
        Picasso.with(context)
                .load(AlbumUtil.getAlbum(simpleItems.get(position).getAlbum()))
                .into(((MenuSimpleViewHolder) holder).ivAlbum);
    }

    @Override
    public int getItemCount() {
        return simpleItems.size();
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
