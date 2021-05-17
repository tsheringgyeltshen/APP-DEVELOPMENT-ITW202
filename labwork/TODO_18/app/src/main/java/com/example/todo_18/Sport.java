package com.example.todo_18;

//This class represents the data for each row of data in the RecyclerView
public class Sport {
    private String title, info;
    private final int imageResource;

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    public Sport(String title, String info, int imageResource){
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
}
