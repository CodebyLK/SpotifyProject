package com.spotify.spotifyproject;

import jakarta.persistence.*;

@Entity
@Table(name = "label", schema = "music")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "label_id", nullable = false)
    private Integer id;

    @Column(name = "label_name", nullable = false)
    private String labelName;

    @Column(name = "country", nullable = false, columnDefinition = "char(3)")
    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}