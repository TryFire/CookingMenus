package com.example.function.cookingmenus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.function.cookingmenus.R;

import java.util.List;

/**
 * Created by function on 2016/2/17.
 */
public class RecommendMenusAdapter extends RecyclerView.Adapter {
    private List<String> names;
    private Context context;

    public RecommendMenusAdapter(Context context, List<String> names) {
        this.context = context;
        this.names = names;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_item, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((ItemViewHolder)viewHolder).tvName.setText(names.get(i));
    }


    @Override
    public int getItemCount() {
        return names.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        public ItemViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.category_name);
        }
    }
}
