package com.example.function.cookingmenus.adapter.item;

/**
 * Created by function on 2016/2/18.
 */
public class CategoryItem {
    private String name;
    private String parentId;

    public CategoryItem(String name, String parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
