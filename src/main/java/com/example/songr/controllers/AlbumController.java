package com.example.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.songr.Album;

import java.util.ArrayList;

@Controller
@RequestMapping("/albums")
public class AlbumController {

@GetMapping("/")
    public String album(Model model){
        ArrayList<Album> albums = new ArrayList<>();

        Album jcole = new Album("The Off-Season", "J-Cole", 12, 39.03, "https://upload.wikimedia.org/wikipedia/en/7/7d/TheOff-Season.jpeg");

        Album kendrick = new Album("Mr. Morale & The Big Steppers", "Kendrick Lamar", 19, 73.05, "https://okayplayer-wpengine.netdna-ssl.com/wp-content/uploads/2022/05/kendrick-lamar-mr-morale-and-the-big-steppers-album-cover.jpeg");

        Album linkinpark = new Album("One More Light", "Linkin Park", 10, 32.29, "https://upload.wikimedia.org/wikipedia/en/b/b2/Linkin_Park%2C_One_More_Light%2C_album_art_final.jpeg" );

        albums.add(jcole);
        albums.add(kendrick);
        albums.add(linkinpark);

        model.addAttribute("albumList", albums);

        return "albums";
    }
}
