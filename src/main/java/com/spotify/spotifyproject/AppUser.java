package com.spotify.spotifyproject;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="app_user", schema = "music")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "f_name", nullable = false, length = 100)
    private String fName;

    @Column(name = "l_name", nullable = false, length = 100)
    private String lName;

    @Column(name = "country", nullable = false, columnDefinition = "char(3)")
    private String country;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "public_username", nullable = false, length = 100)
    private String publicUsername;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @Column(name = "last_login_date", nullable = false)
    private LocalDateTime lastLoginDate;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @OneToMany(mappedBy = "creatorUser")
    private Set<Playlist> playlists = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserArtistFollow> userArtistFollows = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserPlaylistFollow> userPlaylistFollows = new LinkedHashSet<>();

    @OneToOne(mappedBy = "appUser")
    private UserProfile userProfile;

    @OneToMany(mappedBy = "user")
    private Set<UserTrackSave> userTrackSaves = new LinkedHashSet<>();

    public Set<UserTrackSave> getUserTrackSaves() {
        return userTrackSaves;
    }

    public void setUserTrackSaves(Set<UserTrackSave> userTrackSaves) {
        this.userTrackSaves = userTrackSaves;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Set<UserPlaylistFollow> getUserPlaylistFollows() {
        return userPlaylistFollows;
    }

    public void setUserPlaylistFollows(Set<UserPlaylistFollow> userPlaylistFollows) {
        this.userPlaylistFollows = userPlaylistFollows;
    }

    public Set<UserArtistFollow> getUserArtistFollows() {
        return userArtistFollows;
    }

    public void setUserArtistFollows(Set<UserArtistFollow> userArtistFollows) {
        this.userArtistFollows = userArtistFollows;
    }

    public Set<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Set<Playlist> playlists) {
        this.playlists = playlists;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPublicUsername() {
        return publicUsername;
    }

    public void setPublicUsername(String publicUsername) {
        this.publicUsername = publicUsername;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", publicUsername='" + publicUsername + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastLoginDate=" + lastLoginDate +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
