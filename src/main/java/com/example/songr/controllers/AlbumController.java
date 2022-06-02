package com.example.songr.controllers;

import com.example.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.songr.model.Album;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

@GetMapping("/album")
    public String album(Model model){
//        ArrayList<Album> albums = new ArrayList<>();
//
//        Album jcole = new Album("The Off-Season", "J-Cole", 12, 39.03, "https://upload.wikimedia.org/wikipedia/en/7/7d/TheOff-Season.jpeg");
//
//        Album kendrick = new Album("Mr. Morale & The Big Steppers", "Kendrick Lamar", 19, 73.05, "https://okayplayer-wpengine.netdna-ssl.com/wp-content/uploads/2022/05/kendrick-lamar-mr-morale-and-the-big-steppers-album-cover.jpeg");
//
//        Album linkinpark = new Album("One More Light", "Linkin Park", 10, 32.29, "https://upload.wikimedia.org/wikipedia/en/b/b2/Linkin_Park%2C_One_More_Light%2C_album_art_final.jpeg" );
//
//        albums.add(jcole);
//        albums.add(kendrick);
//        albums.add(linkinpark);
//
//        model.addAttribute("albumList", albums);
//      list of Albums -> go find all the Albums and put them in my list "Album" -> give list to front-end and return it to specific template on line #44
        List<Album> album = albumRepository.findAll();
        model.addAttribute("albumList", album);

        return "albums";
        // return "salmon-cookies/salmon-cookies-stores";
    }

    @PostMapping("/addAlbum")
    public RedirectView createAlbum(String title, String name, Integer songCount, Integer length, String imgUrl){
        Album newAlbum = new Album(title, name, songCount, length, imgUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/album");
    }
}
