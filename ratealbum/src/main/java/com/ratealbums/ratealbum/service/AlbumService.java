package com.ratealbums.ratealbum.service;

import com.ratealbums.ratealbum.model.Album;
import com.ratealbums.ratealbum.repo.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;


@Service
public class AlbumService {


    public final AlbumRepo albumRepo;

    @Autowired
    public AlbumService(AlbumRepo albumRepo) {
        this.albumRepo = albumRepo;
    }

    public Album addAlbum(Album album){
        return albumRepo.save(album);
    }
    public List<Album> findAllAlbums(){
        return albumRepo.findAll();
    }
    public Album updateAlbum(Album album){
        return albumRepo.save(album);
    }
    public Album findAlbumById(Long id){
        return (Album) albumRepo.findAlbumById(id).get();
    }

    public void deleteAlbum(Long id){
        albumRepo.deleteAlbumById(id);

    }
}
