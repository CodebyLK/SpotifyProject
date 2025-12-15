package com.spotify.spotifyproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpotifyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotifyProjectApplication.class, args);
    }

    // This block runs automatically when the app starts
    @Bean
    public CommandLineRunner readData(TrackRepository repository, ArtistRepository artistRepository) {
        return args -> {
            System.out.println("------------------------------------------------");
            System.out.println("🔍 READING EXISTING DATA FROM SQL SERVER...");
            System.out.println("------------------------------------------------");

            var tracks = repository.findAll();
            var artists = artistRepository.findAll();

            if (tracks.isEmpty() || artists.isEmpty()) {
                System.out.println("⚠️ No data found! Check your Table Name and mappings.");
            } else {
                // Loop through and print every song found in the DB
                tracks.forEach(System.out::println);
                artists.forEach(System.out::println);
            }

            System.out.println("------------------------------------------------");
        };
    }
}
