package com.spotify.spotifyproject;

import jakarta.persistence.*;

@Entity
@Table(name = "artist_group", schema = "music")
public class ArtistGroup {
    @EmbeddedId
    private ArtistGroupId id;

    @MapsId("soloArtistId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "solo_artist_id", nullable = false)
    private Artist soloArtist;

    @MapsId("groupArtistId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "group_artist_id", nullable = false)
    private Artist groupArtist;

    public ArtistGroupId getId() {
        return id;
    }

    public void setId(ArtistGroupId id) {
        this.id = id;
    }

    public Artist getSoloArtist() {
        return soloArtist;
    }

    public void setSoloArtist(Artist soloArtist) {
        this.soloArtist = soloArtist;
    }

    public Artist getGroupArtist() {
        return groupArtist;
    }

    public void setGroupArtist(Artist groupArtist) {
        this.groupArtist = groupArtist;
    }

}