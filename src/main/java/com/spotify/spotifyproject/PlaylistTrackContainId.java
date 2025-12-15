package com.spotify.spotifyproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
public class PlaylistTrackContainId implements Serializable {
    private static final long serialVersionUID = 3659229035500700456L;
    @Column(name = "playlist_id", nullable = false)
    private Integer playlistId;

    @Column(name = "track_id", nullable = false)
    private Integer trackId;

    @Column(name = "datetime_added", nullable = false)
    private LocalDateTime datetimeAdded;

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public LocalDateTime getDatetimeAdded() {
        return datetimeAdded;
    }

    public void setDatetimeAdded(LocalDateTime datetimeAdded) {
        this.datetimeAdded = datetimeAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlaylistTrackContainId entity = (PlaylistTrackContainId) o;
        return Objects.equals(this.playlistId, entity.playlistId) &&
                Objects.equals(this.trackId, entity.trackId) &&
                Objects.equals(this.datetimeAdded, entity.datetimeAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, trackId, datetimeAdded);
    }

}