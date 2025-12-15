package com.spotify.spotifyproject;

import jakarta.persistence.*;

@Entity
@Table(name = "track_genre_tags", schema = "music")
public class TrackGenreTag {
    @EmbeddedId
    private TrackGenreTagId id;

    @MapsId("trackId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "track_id", nullable = false)
    private Track track;

    @MapsId("genreId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;

    public TrackGenreTagId getId() {
        return id;
    }

    public void setId(TrackGenreTagId id) {
        this.id = id;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}