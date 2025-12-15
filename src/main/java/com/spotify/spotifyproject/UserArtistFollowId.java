package com.spotify.spotifyproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserArtistFollowId implements Serializable {
    private static final long serialVersionUID = 832849401077024523L;
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "artist_id", nullable = false)
    private Integer artistId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserArtistFollowId entity = (UserArtistFollowId) o;
        return Objects.equals(this.artistId, entity.artistId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, userId);
    }

}