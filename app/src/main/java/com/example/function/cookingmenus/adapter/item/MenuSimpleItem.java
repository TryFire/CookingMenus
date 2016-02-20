package com.example.function.cookingmenus.adapter.item;

/**
 * Created by function on 2016/2/19.
 */
public class MenuSimpleItem {
    private String id;
    private String title;
    private String album;
    private String imtro;

    public MenuSimpleItem() {
    }

    public MenuSimpleItem(String title, String imtro, String album) {
        this.title = title;
        this.album = album;
        this.imtro = imtro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getImtro() {
        return imtro;
    }

    public void setImtro(String imtro) {
        this.imtro = imtro;
    }
}
