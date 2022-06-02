package com.example.songr.repository;


import com.example.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    // The reason we are using an interface is so we can create CUSTOM CRUD queries

    // Jpa knows how to findBy existing properties
//    public Album findByName(String name);

}
