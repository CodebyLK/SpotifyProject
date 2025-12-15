package com.spotify.spotifyproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TrackGenreTagId implements Serializable {
    private static final long serialVersionUID = 7388946557550769254L;
    @Column(name = "track_id", nullable = false)
    private Integer trackId;

    @Column(name = "genre_id", nullable = false)
    private Integer genreId;

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TrackGenreTagId entity = (TrackGenreTagId) o;
        return Objects.equals(this.genreId, entity.genreId) &&
                Objects.equals(this.trackId, entity.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, trackId);
    }

}