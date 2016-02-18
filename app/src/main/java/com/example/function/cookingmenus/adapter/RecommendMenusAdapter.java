package com.example.function.cookingmenus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.function.cookingmenus.R;
import com.example.function.cookingmenus.adapter.item.CategoryItem;

import java.util.List;

/**
 * Created by function on 2016/2/17.
 */
public class RecommendMenusAdapter extends RecyclerView.Adapter implements View.OnClickListener {
    private List<CategoryItem> names;
    private Context context;
    private OnItemviewClickListener itemviewClickListener;

    public RecommendMenusAdapter(Context context, List<CategoryItem> names) {
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
        ((ItemViewHolder)viewHolder).viewContent.setTag(i);
        ((ItemViewHolder)viewHolder).tvName.setText(names.get(i).getName());
        ((ItemViewHolder)viewHolder).viewContent.setOnClickListener(this);
    }


    @Override
    public int getItemCount() {
        return names.size();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.view_content) {
            if (itemviewClickListener != null) {
                itemviewClickListener.onItemviewClick(v, (Integer) v.getTag());
            }
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        View viewContent;
        public ItemViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.category_name);
            viewContent = itemView.findViewById(R.id.view_content);
        }
    }

    public interface OnItemviewClickListener{
        void onItemviewClick(View v, int i);
    }

    public void setOnItemviewClickListener(OnItemviewClickListener listener) {
        itemviewClickListener = listener;
    }
}
