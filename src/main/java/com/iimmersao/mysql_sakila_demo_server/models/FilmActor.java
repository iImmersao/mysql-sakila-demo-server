package com.iimmersao.mysql_sakila_demo_server.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@IdClass(FilmActorId.class)
@Table(name="film_actor", schema="sakila")
public class FilmActor {

    @Id
    @Column(name = "actor_id", columnDefinition = "smallint unsigned")
    private Long actorId;

    @Id
    @Column(name = "film_id", columnDefinition = "smallint unsigned")
    private Long filmId;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilm_id(Long filmId) {
        this.filmId = filmId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
