package com.iimmersao.mysql_sakila_demo_server.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class FilmActorId implements Serializable {
    private Long actorId;

    private Long filmId;

    private FilmActorId() {
        // Default
    }

    public FilmActorId(Long actorId, Long filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        FilmActorId that = (FilmActorId) o;
        return actorId.equals(that.actorId) && filmId.equals(that.filmId);
    }

    @Override
    public int hashCode() {
        int result = actorId.hashCode();
        result = 31 * result + filmId.hashCode();
        return result;
    }
}
