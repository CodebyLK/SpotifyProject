package com.spotify.spotifyproject;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
//import org.jspecify.annotations.NonNull;

@Entity
@Nonnull
@Table(name = "track", schema = "music")
public class Track {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "duration_ms", nullable = false)
    private Integer durationMs;

    @ColumnDefault("0")
    @Column(name = "explicit_content", nullable = false)
    private Boolean explicitContent = false;

    @Column(name = "audio_file_url", nullable = false)
    private String audioFileUrl;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "performer_artist_id", nullable = false)
    private Artist performerArtist;

    public Artist getPerformerArtist() {
        return performerArtist;
    }

    public void setPerformerArtist(Artist performerArtist) {
        this.performerArtist = performerArtist;
    }

    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    /*
    public void setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

     */

    public Boolean getExplicitContent() {
        return explicitContent;
    }

    /*
    public void setExplicitContent(Boolean explicitContent) {
        this.explicitContent = explicitContent;
    }

     */

    public Integer getDurationMs() {
        return durationMs;
    }

    /*
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

     */

    public String getTitle() {
        return title;
    }

    /*
    public void setTitle(String title) {
        this.title = title;
    }

     */

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", durationMs=" + durationMs +
                ", explicitContent=" + explicitContent +
                ", audioFileUrl='" + audioFileUrl + '\'' +
                '}';
    }

    /*
    public void setId(Integer id) {
        this.id = id;
    }

     */



}
