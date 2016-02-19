package com.example.function.cookingmenus.service.model.categorydetail;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by function on 2016/2/19.
 */
public class Datum {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("tags")
    private String tags;
    @SerializedName("imtro")
    private String imtro;
    @SerializedName("ingredients")
    private String ingredients;
    @SerializedName("burden")
    private String burden;
    @SerializedName("albums")
    private java.util.List<String> albums = new ArrayList<>();
    /*@SerializedName("steps")
    @Expose
    private List<Step> steps = new ArrayList<Step>();*/

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The imtro
     */
    public String getImtro() {
        return imtro;
    }

    /**
     *
     * @param imtro
     * The imtro
     */
    public void setImtro(String imtro) {
        this.imtro = imtro;
    }

    /**
     *
     * @return
     * The ingredients
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     *
     * @param ingredients
     * The ingredients
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    /**
     *
     * @return
     * The burden
     */
    public String getBurden() {
        return burden;
    }

    /**
     *
     * @param burden
     * The burden
     */
    public void setBurden(String burden) {
        this.burden = burden;
    }

    /**
     *
     * @return
     * The albums
     */
    public java.util.List<String> getAlbums() {
        return albums;
    }

    /**
     *
     * @param albums
     * The albums
     */
    public void setAlbums(java.util.List<String> albums) {
        this.albums = albums;
    }

    /**
     *
     * @return
     * The steps
     */
    /*public List<Step> getSteps() {
        return steps;
    }*/

    /**
     *
     * @param steps
     * The steps
     */
    /*public void setSteps(List<Step> steps) {
        this.steps = steps;
    }*/

}