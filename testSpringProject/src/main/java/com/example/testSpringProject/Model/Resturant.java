package com.example.testSpringProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "RESTURANT")
public class Resturant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CUISINE")
    private String cuisine;

    private Long getId() {
        return this.Id;
    }
    private String getName() {
        return this.name;
    }
    private String getCuisine() {
        return this.cuisine;
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
    private void setId(Long id) {
        this.Id = id;
    }

}
