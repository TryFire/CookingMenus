package com.example.function.cookingmenus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.function.cookingmenus.R;
import com.example.function.cookingmenus.adapter.item.CategoryDetailItem;

import java.util.List;

/**
 * Created by function on 2016/2/19.
 */
public class CategoryDetailAdapter extends RecyclerView.Adapter implements View.OnClickListener{
    private Context context;
    private List<CategoryDetailItem> items;
    private OnDetailItemClickListener listener;
    public CategoryDetailAdapter(Context context, List<CategoryDetailItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_item, parent, false);
        DetailItemViewHolder viewHolder = new DetailItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((DetailItemViewHolder) holder).viewContent.setOnClickListener(this);
        ((DetailItemViewHolder) holder).viewContent.setTag(position);
        ((DetailItemViewHolder)holder).tvName.setText(items.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.view_content) {
            if(listener != null) {
                listener.onDetailItemClick(v, (Integer) v.getTag());
            }
        }
    }

    class DetailItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        View viewContent;
        public DetailItemViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.category_name);
            viewContent = itemView.findViewById(R.id.view_content);
        }
    }

    public interface OnDetailItemClickListener {
        void onDetailItemClick(View v, int position);
    }

    public void setOnDetailItemClickListener(OnDetailItemClickListener listener) {
        this.listener = listener;
    }
}
