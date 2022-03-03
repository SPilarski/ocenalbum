package com.ratealbums.ratealbum.repo;

import com.ratealbums.ratealbum.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface AlbumRepo extends JpaRepository<Album, Long> {
    void deleteAlbumById(Long id);

    Optional<Album> findAlbumById(Long id);
}
