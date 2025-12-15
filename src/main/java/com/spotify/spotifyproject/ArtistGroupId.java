package com.spotify.spotifyproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArtistGroupId implements Serializable {
    private static final long serialVersionUID = 3837795000955833286L;
    @Column(name = "solo_artist_id", nullable = false)
    private Integer soloArtistId;

    @Column(name = "group_artist_id", nullable = false)
    private Integer groupArtistId;

    public Integer getSoloArtistId() {
        return soloArtistId;
    }

    public void setSoloArtistId(Integer soloArtistId) {
        this.soloArtistId = soloArtistId;
    }

    public Integer getGroupArtistId() {
        return groupArtistId;
    }

    public void setGroupArtistId(Integer groupArtistId) {
        this.groupArtistId = groupArtistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ArtistGroupId entity = (ArtistGroupId) o;
        return Objects.equals(this.soloArtistId, entity.soloArtistId) &&
                Objects.equals(this.groupArtistId, entity.groupArtistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soloArtistId, groupArtistId);
    }

}