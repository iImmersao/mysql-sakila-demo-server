package com.iimmersao.mysql_sakila_demo_server.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.Year;

@Entity
@Table(name="film", schema="sakila")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "smallint unsigned")
    private Long filmId;

    @Column(name = "title", columnDefinition = "varchar(128)")
    private String title;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "release_year", columnDefinition = "year")
    private Year releaseYear;

    @Column(name = "language_id", columnDefinition = "tinyint unsigned")
    private int languageId;

    @Column(name = "original_language_id", columnDefinition = "tinyint unsigned")
    private Integer originalLanguageId;

    @Column(name = "rental_duration", columnDefinition = "tinyint unsigned")
    private int rentalDuration;

    @Column(name = "rental_rate", columnDefinition = "decimal")
    private float rentalRate;

    @Column(name = "length", columnDefinition = "smallint unsigned")
    private int length;

    @Column(name = "replacement_cost", columnDefinition = "decimal")
    private float replacementCost;

    //@Column(name = "rating", nullable = false, columnDefinition = "ENUM('G','PG','PG-13','R','NC-17')")
    @Column(name = "rating", columnDefinition = "enum('G', 'PG', 'PG-13', 'R', 'NC-17')")
    //@Enumerated(EnumType.STRING)
    private String rating;

    @Column(name = "special_features", columnDefinition = "set('Trailers','Commentaries','Deleted Scenes', 'Behind the Scenes')")
    private String specialFeatures;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public float getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(float rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
