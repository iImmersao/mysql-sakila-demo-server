package com.iimmersao.mysql_sakila_demo_server.respositories;

import com.iimmersao.mysql_sakila_demo_server.models.FilmActor;
import com.iimmersao.mysql_sakila_demo_server.models.FilmActorId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmActorRepository extends CrudRepository<FilmActor, FilmActorId> {
    List<FilmActor> findByFilmId(Long filmId);
    List<FilmActor> findByActorId(Long actorId);
}
