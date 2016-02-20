package com.example.function.cookingmenus.utils;

/**
 * Created by function on 2016/2/20.
 */
public class AlbumUtil {
    public static String getAlbum(String oldAlbum) {
        String album = oldAlbum.replace("\\", "");
        return album;
    }
}
