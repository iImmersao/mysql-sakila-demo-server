package com.iimmersao.mysql_sakila_demo_server.respositories;

import com.iimmersao.mysql_sakila_demo_server.models.Film;
import jakarta.persistence.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Long> {
    public Film findByFilmId(Long filmId);

    public List<Film> findByTitleContaining(String title);
    public List<Film> findByTitleContains(String title);
    public List<Film> findByTitleIsContaining(String title);

    public List<Film> findByTitleLike(String title);
}
