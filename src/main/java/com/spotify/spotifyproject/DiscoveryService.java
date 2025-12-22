package com.spotify.spotifyproject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;



@Service
@Transactional(readOnly=true)
public class DiscoveryService {

    private final UserArtistFollowRepository followRepository;
    private final TrackRepository trackRepository;

    public DiscoveryService(UserArtistFollowRepository followRepository, TrackRepository trackRepository) {
        this.followRepository = followRepository;
        this.trackRepository = trackRepository;
    }

    /**
     * Finds tracks performed by artists that the user follows.
     */
    @Transactional(readOnly = true)
    public List<Track> getRecommendedTracks(Integer userId) {
        // 1. Get the list of artists the user follows
        List<Artist> followedArtists = followRepository.findArtistsByUserId(userId);

        // 2. Find all tracks where the performer is in that list
        // Note: In a real app, you might limit this to the top 20 or most recent
        return trackRepository.findAll().stream()
                .filter(track -> followedArtists.contains(track.getPerformerArtist()))
                .collect(Collectors.toList());
    }
}