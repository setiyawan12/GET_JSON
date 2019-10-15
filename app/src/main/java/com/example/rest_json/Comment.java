package com.example.rest_json;

import com.google.gson.annotations.SerializedName;

public class Comment {
    private int user_Id;
    private int id;
    private String title;
    @SerializedName("body")
    private String text;

    public int getUser_Id() {
        return user_Id;
    }

    public int getId() {
        return id;
    }

    public String gettitle() {
        return title;
    }

    public String getText() {
        return text;
    }

}

