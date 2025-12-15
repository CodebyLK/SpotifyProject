package com.spotify.spotifyproject;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "release", schema = "music")
public class Release {
    @Id
    @Column(name = "release_id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "release_type", nullable = false, length = 50)
    private String releaseType;

    @Column(name = "cover_image_url")
    private String coverImageUrl;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "publisher_label_id", nullable = false)
    private Label publisherLabel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "primary_artist_id", nullable = false)
    private Artist primaryArtist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public Label getPublisherLabel() {
        return publisherLabel;
    }

    public void setPublisherLabel(Label publisherLabel) {
        this.publisherLabel = publisherLabel;
    }

    public Artist getPrimaryArtist() {
        return primaryArtist;
    }

    public void setPrimaryArtist(Artist primaryArtist) {
        this.primaryArtist = primaryArtist;
    }

}