package com.example.testSpringProject.Repositories;

import com.example.testSpringProject.Model.Resturant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ResturantRepository extends CrudRepository<Resturant, Long> {
    boolean existsByName(String name);
    Optional<Resturant> findByName(String name);
}