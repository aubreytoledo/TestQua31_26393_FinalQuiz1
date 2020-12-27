package com.example.phonebookwithdatabase;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.io.File;

public class Student {
    private int id;
    private Uri img;
    public byte[] by;
    public String name, phone;

    public Student(Uri img, String name, String phone, byte[] by) {
        id = -1;
        this.img = img;
        this.name = name;
        this.phone = phone;
        this.by = by;
    }

    public Student(int id, Uri img, String name, String phone, byte[] by) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.phone = phone;
        this.by = by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Uri getImg() {
        return img;
    }

    public void setImg(Uri img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
/*
    private Uri image;
    Drawable pic;
    File path;
    private String name,num;

    public Student(String name, String num, Uri image, Drawable pic) {
        this.image = image;
        this.pic = pic;
        this.name = name;
        this.num = num;
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}*/
