package com.example.testSpringProject.Controller;

import com.example.testSpringProject.Model.Resturant;
import com.example.testSpringProject.Repositories.ResturantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
public class ResturantController {
    @Autowired
    private ResturantRepository resturantRepository;

    @GetMapping("/restaurants")
    public Iterable<Resturant> getAllRestaurants() {
        return resturantRepository.findAll();
    }

}
