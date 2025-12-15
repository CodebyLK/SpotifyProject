package com.spotify.spotifyproject;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_track_saves", schema = "music")
public class UserTrackSave {
    @EmbeddedId
    private UserTrackSaveId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    @MapsId("trackId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "track_id", nullable = false)
    private Track track;

    @ColumnDefault("getdate()")
    @Column(name = "save_datetime", nullable = false)
    private LocalDateTime saveDatetime;

    public UserTrackSaveId getId() {
        return id;
    }

    public void setId(UserTrackSaveId id) {
        this.id = id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public LocalDateTime getSaveDatetime() {
        return saveDatetime;
    }

    public void setSaveDatetime(LocalDateTime saveDatetime) {
        this.saveDatetime = saveDatetime;
    }

}