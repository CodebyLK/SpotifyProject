package com.spotify.spotifyproject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserPlaylistFollowId implements Serializable {
    private static final long serialVersionUID = -7810385175371771986L;
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "playlist_id", nullable = false)
    private Integer playlistId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserPlaylistFollowId entity = (UserPlaylistFollowId) o;
        return Objects.equals(this.playlistId, entity.playlistId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, userId);
    }

}