package com.example.testSpringProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "DINING_REVIEW")
public class DiningReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "REVIEW_BY")
    private String reviewBy;
    @Column(name = "OVERALL_RATING")
    private int overallRating;
    @Column(name = "SEAFOOD_RATING")
    private int seaFoodRating;
    @Column(name = "CHICKEN_RATING")
    private int chickenRating;
    @Column(name = "BEEF_RATING")
    private int beefRating;
    @Column(name = "PORK_RATING")
    private int porkRating;

    private Long getId() {
        return this.id;
    }
    private String getReviewBy() {
        return this.reviewBy;
    }
    private int getOverallRating() {
        return this.overallRating;
    }
    private int getSeaFoodRating() {
        return this.seaFoodRating;
    }
    private int getChickenRating() {
        return this.chickenRating;
    }
    private int getBeefRating() {
        return this.beefRating;
    }
    private int getPorkRating() {
        return this.porkRating;
    }

    private void setId(Long id) {
        this.id = id;
    }
    private void setReviewBy(String reviewBy) {
        this.reviewBy = reviewBy;
    }
    private void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }
    private void setSeaFoodRating(int seaFoodRating) {
        this.seaFoodRating = seaFoodRating;
    }
    private void setChickenRating(int chickenRating) {
        this.chickenRating = chickenRating;
    }
    private void setBeefRating(int beefRating) {
        this.beefRating = beefRating;
    }
    private void setPorkRating(int porkRating) {
        this.porkRating = porkRating;
    }

}
