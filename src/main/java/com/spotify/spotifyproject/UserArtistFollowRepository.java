package com.spotify.spotifyproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserArtistFollowRepository extends JpaRepository<UserArtistFollow, UserArtistFollowId> {

    // Custom query to find all Artists followed by a specific User ID
    @Query("SELECT f.artist FROM UserArtistFollow f WHERE f.user.id = :userId")
    List<Artist> findArtistsByUserId(@Param("userId") Integer userId);
}