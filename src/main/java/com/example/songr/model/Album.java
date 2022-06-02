package com.example.songr.model;

import javax.persistence.*;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

// model: storing/working with. classes that represents the data. For Ex: album(describe)
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public String title;
    public String artist;
    public int songCount;
    public double length;
    public String imgUrl;



    public Album(){

    }

    public Album(String title, String artist, int songCount, double length, String imgUrl) {
        // defining and using the properties of instantiation/constructor Album.
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int SongCount(){
        return songCount;
    }
    public double length(){
        return length;
    }
    public String getImgUrl(){
        return imgUrl;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }
}
