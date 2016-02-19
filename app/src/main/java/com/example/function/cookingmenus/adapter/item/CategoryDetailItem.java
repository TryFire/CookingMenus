package com.example.function.cookingmenus.adapter.item;

/**
 * Created by function on 2016/2/19.
 */
public class CategoryDetailItem {
    private String id;
    private String name;

    public CategoryDetailItem(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
