package com.ratealbums.ratealbum.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Album implements Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    Long id;
    String name;
    String artist;
    String Cover;

    public Album() {
    }

    public Album(Long id, String name, String artist, String cover) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        Cover = cover;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String cover) {
        Cover = cover;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", Cover='" + Cover + '\'' +
                '}';
    }
}
