package com.example.function.cookingmenus.service;


import com.example.function.cookingmenus.Constants;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by function on 2016/2/1.
 */
public class BaseService {
    private static Retrofit mRetrofit;
    private static MenuNamesService mMenuNamesService;
    private static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }
    public static MenuNamesService getMenuNamesService() {
        if (mMenuNamesService == null) {
            mMenuNamesService = getRetrofit().create(MenuNamesService.class);
        }
        return mMenuNamesService;
    }

}
