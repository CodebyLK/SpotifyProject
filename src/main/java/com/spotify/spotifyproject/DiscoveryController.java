package com.spotify.spotifyproject;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/discovery")
public class DiscoveryController {

    private final DiscoveryService discoveryService;

    public DiscoveryController(DiscoveryService discoveryService) {
        this.discoveryService = discoveryService;
    }

    //http://localhost:8080/api/discovery/recommendations/1

    @GetMapping("/recommendations/{userId}")
    public List<Track> getRecommendations(@PathVariable Integer userId) {
        return discoveryService.getRecommendedTracks(userId);
    }
}