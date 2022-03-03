package com.ratealbums.ratealbum;


import com.ratealbums.ratealbum.model.Album;
import com.ratealbums.ratealbum.service.AlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumResource {
    private final AlbumService albumService;

    public AlbumResource(AlbumService albumService) {
        this.albumService = albumService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Album>> getAllAlbums () {
        List<Album> albums = albumService.findAllAlbums();
        return new ResponseEntity<>(albums, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Album> getAlbumById (@PathVariable("id")Long id) {
        Album album = albumService.findAlbumById(id);
        return new ResponseEntity<>(album, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Album> addAlbum(@RequestBody Album album) {
        Album newAlbum = albumService.addAlbum(album);
        return new ResponseEntity<>(newAlbum, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Album> updateAlbum(@RequestBody Album album) {
        Album updateAlbum = albumService.updateAlbum(album);
        return new ResponseEntity<>(updateAlbum, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAlbum(@PathVariable("id")Long id) {
        albumService.deleteAlbum(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
