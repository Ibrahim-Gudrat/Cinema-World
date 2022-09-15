package com.abrahamgudratli.cinemaworld;

import androidx.annotation.DrawableRes;

public class ProductListEntry {

    String title;
    String description;
    int image;
    float rating;

    public ProductListEntry(String title, String description, @DrawableRes int image, float rating) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
