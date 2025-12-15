package com.spotify.spotifyproject;

import jakarta.persistence.*;

@Entity
@Table(name = "release_tracks", schema = "music")
public class ReleaseTrack {
    @EmbeddedId
    private ReleaseTrackId id;

    @MapsId("releaseId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_id", nullable = false)
    private Release release;

    @MapsId("trackId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "track_id", nullable = false)
    private Track track;

    @Column(name = "track_number_on_release", nullable = false)
    private Integer trackNumberOnRelease;

    public ReleaseTrackId getId() {
        return id;
    }

    public void setId(ReleaseTrackId id) {
        this.id = id;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Integer getTrackNumberOnRelease() {
        return trackNumberOnRelease;
    }

    public void setTrackNumberOnRelease(Integer trackNumberOnRelease) {
        this.trackNumberOnRelease = trackNumberOnRelease;
    }

}