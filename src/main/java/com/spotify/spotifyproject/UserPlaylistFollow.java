package com.spotify.spotifyproject;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_playlist_follows", schema = "music")
public class UserPlaylistFollow {
    @EmbeddedId
    private UserPlaylistFollowId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    @MapsId("playlistId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "playlist_id", nullable = false)
    private Playlist playlist;

    @ColumnDefault("getdate()")
    @Column(name = "follow_datetime", nullable = false)
    private LocalDateTime followDatetime;

    @ColumnDefault("0")
    @Column(name = "can_edit", nullable = false)
    private Boolean canEdit = false;

    public UserPlaylistFollowId getId() {
        return id;
    }

    public void setId(UserPlaylistFollowId id) {
        this.id = id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public LocalDateTime getFollowDatetime() {
        return followDatetime;
    }

    public void setFollowDatetime(LocalDateTime followDatetime) {
        this.followDatetime = followDatetime;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

}