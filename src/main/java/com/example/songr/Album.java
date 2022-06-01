package com.example.songr;

public class Album {
    public String title;
    public String artist;
    public int songCount;
    public double length;
    public String imgUrl;

    public Album(String title, String artist, int songCount, double length, String imgUrl) {
        // defining and using the properties of instantiation/constructor Album.
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
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
}
