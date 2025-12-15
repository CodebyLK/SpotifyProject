package com.spotify.spotifyproject;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_artist_follows", schema = "music")
public class UserArtistFollow {
    @EmbeddedId
    private UserArtistFollowId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    @MapsId("artistId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @ColumnDefault("getdate()")
    @Column(name = "follow_datetime", nullable = false)
    private LocalDateTime followDatetime;

    public UserArtistFollowId getId() {
        return id;
    }

    public void setId(UserArtistFollowId id) {
        this.id = id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public LocalDateTime getFollowDatetime() {
        return followDatetime;
    }

    public void setFollowDatetime(LocalDateTime followDatetime) {
        this.followDatetime = followDatetime;
    }

}