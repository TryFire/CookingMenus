package com.example.function.cookingmenus.service;

import com.example.function.cookingmenus.service.model.CategoryResp;
import com.example.function.cookingmenus.service.model.MenuResp;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;


/**
 * Created by function on 2016/1/28.
 */
public interface MenuNamesService {

    @GET("/cook/query.php")
    Call<MenuResp> getMenus(@QueryMap Map<String, String> options);


    @FormUrlEncoded
    @POST("")
    Call<MenuResp> getMenusPost(@Field("menu")String menu,
                                @Field("pn")String pn,
                                @Field("rn")String rn,
                                @Field("key")String appKey);

    @FormUrlEncoded
    @POST("/cook/category")
    Call<CategoryResp> getMenuCategory(@Field("parentid")int parentId,
                                       @Field("dtype")String dType,
                                       @Field("key")String appKey);

    @GET("https://apis.juhe.cn/cook/category?parentid=10001&key=e18cab739f0f6bd11cbc44cd263d5efc")
    Call<CategoryResp> getCategory();


    @GET("/cook/category")
    Call<CategoryResp> getCategory(@Query("parentid") int parentId, @Query("key") String appKey);

    @GET("/cook/category")
    Call<CategoryResp> getCategorys(@Query("key") String appKey);
}
