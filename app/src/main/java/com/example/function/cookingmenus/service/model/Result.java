package com.example.function.cookingmenus.service.model;

import java.util.ArrayList;

public class Result {

    private String parentId;
    private String name;
    //private String list;
    private java.util.List<List> list = new ArrayList<List>();

    /**
     *
     * @return
     * The parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     *
     * @param parentId
     * The parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The list
     */
    public java.util.List<List> getList() {
        return list;
    }

    /**
     *
     * @param list
     * The list
     */
    public void setList(java.util.List<List> list) {
        this.list = list;
    }

}
