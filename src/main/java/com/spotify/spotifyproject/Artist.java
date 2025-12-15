package com.spotify.spotifyproject;

import jakarta.persistence.*;

@Entity
@Table(name = "artist", schema = "music")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id", nullable = false)
    private Integer id;

    @Column(name = "artist_name", nullable = false)
    private String artistName;

    @Column(name = "country", columnDefinition = "char(3)")
    private String country;

    @Lob
    @Column(name = "bio")
    private String bio;

    @Column(name = "artist_image_url")
    private String artistImageUrl;

    @Column(name = "is_solo")
    private Boolean isSolo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getArtistImageUrl() {
        return artistImageUrl;
    }

    public void setArtistImageUrl(String artistImageUrl) {
        this.artistImageUrl = artistImageUrl;
    }

    public Boolean getIsSolo() {
        return isSolo;
    }

    public void setIsSolo(Boolean isSolo) {
        this.isSolo = isSolo;
    }


    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", artistName='" + artistName + '\'' +
                ", country='" + country + '\'' +
                ", bio='" + bio + '\'' +
                ", artistImageUrl='" + artistImageUrl + '\'' +
                ", isSolo=" + isSolo +
                '}';
    }
}