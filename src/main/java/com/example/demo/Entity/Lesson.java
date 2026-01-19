package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lessons")

public class Lesson {
  @Id
    private String id;
    private String title;
    private String description;
    private String imageurl;

    public Lesson() {
    }

    public Lesson(String title, String description, String imageurl) {
        this.title = title;
        this.description = description;
        this.imageurl = imageurl;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageurl;
    }

    public void setImageUrl(String imageurl) {
        this.imageurl = imageurl;
    }

     @Override
    public String toString() {
        return "Lesson [id=" + id + ", title=" + title + ", imageurl=" + imageurl + "]";
    }
}
