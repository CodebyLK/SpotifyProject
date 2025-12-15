package com.spotify.spotifyproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReleaseTrackId implements Serializable {
    private static final long serialVersionUID = -1577219064638701491L;
    @Column(name = "release_id", nullable = false)
    private Integer releaseId;

    @Column(name = "track_id", nullable = false)
    private Integer trackId;

    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseTrackId entity = (ReleaseTrackId) o;
        return Objects.equals(this.releaseId, entity.releaseId) &&
                Objects.equals(this.trackId, entity.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseId, trackId);
    }

}