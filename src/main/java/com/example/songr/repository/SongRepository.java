package com.example.songr.repository;

import com.example.songr.model.Song;
//import com.example.songr.repository.AlbumRepository; <--- Do I need this?? I don't think so. Why would I need to import
import org.springframework.data.jpa.repository.JpaRepository;


public interface SongRepository extends JpaRepository<Song, Long> {
    // can we leave this blank? Yes
    //This is for custom queries
}
