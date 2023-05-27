package com.example.rentalservice.service;

import com.example.rentalservice.controller.RentalController;
import com.example.rentalservice.model.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id){
        final String uri = "http://localhost:8080/movies/"+id;

        return restTemplate.getForObject(URI.create(uri), Movie.class);
    }
}
