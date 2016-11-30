package com.example.jean.jcplayer;

import android.content.Context;

import com.example.jean.jcplayer.JcPlayerExceptions.AudioInvalidPathException;

import java.io.Serializable;

/**
 * Created by jean on 27/06/16.
 */

public class JcAudio implements Serializable {
    private int id;
    private String title;
    private int position;
    private Origin origin;
    private String path;
    public static String[] formats = new String[]{".mp3"};


    public JcAudio(String path, String title, int id, int position){
        this.id = id;
        this.position = position;
        this.title = title;
        this.path = path;
    }

    public JcAudio(String path, String title, Context context){
        // It looks bad
        int randomNumber = path.length() + title.length();

        this.id = randomNumber;
        this.position = randomNumber;
        this.title = title;
        this.path = path;
    }

    public JcAudio(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
}