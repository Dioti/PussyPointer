package com.dioti.pussypointer.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "images")
public class Image {
    @Id
    private String id;

    private Integer x;
    private Integer y;
    private String src;

    public Image(String id, Integer x, Integer y, String src) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.src = src;
    }

    public Image(Integer x, Integer y, String src) {
        this.x = x;
        this.y = y;
        this.src = src;
    }

    public Image() { }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
