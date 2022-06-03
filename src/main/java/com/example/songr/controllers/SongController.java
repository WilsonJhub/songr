package com.example.songr.controllers;

import com.example.songr.model.Album;
import com.example.songr.model.Song;
import com.example.songr.repository.AlbumRepository;
import com.example.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @PostMapping("/add-song")
    public RedirectView addSongToAlbum(String title, int length, int trackNumber, String album){
        Album songToAlbum = albumRepository.findByTitle(album);
        Song newSong = new Song(title, length, trackNumber, songToAlbum);
        songRepository.save(newSong);

        return new RedirectView("/album");
    }




}
