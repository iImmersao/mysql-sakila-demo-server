package com.iimmersao.mysql_sakila_demo_server.controllers;

import com.iimmersao.mysql_sakila_demo_server.models.Actor;
import com.iimmersao.mysql_sakila_demo_server.models.Film;
import com.iimmersao.mysql_sakila_demo_server.models.FilmActor;
import com.iimmersao.mysql_sakila_demo_server.respositories.ActorRepository;
import com.iimmersao.mysql_sakila_demo_server.respositories.FilmActorRepository;
import com.iimmersao.mysql_sakila_demo_server.respositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/film")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmActorRepository filmActorRepository;

    @Autowired
    private ActorRepository actorRepository;

    @PostMapping()
    public @ResponseBody Film addNewFilm(@RequestBody Film film) {
        film.setFilmId(null);
        film.setLastUpdate(LocalDateTime.now());
        return filmRepository.save(film);
    }

    @GetMapping()
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @GetMapping(path="/{filmId}")
    public @ResponseBody Film getActor(@PathVariable long filmId) {
        System.out.println("Getting film by id");
        Optional<Film> result = filmRepository.findById(filmId);
        return result.orElse(null);
    }

    @GetMapping(path="/{filmId}/cast")
    public @ResponseBody List<String> getCast(@PathVariable Long filmId) {
        System.out.println("Getting actors by film id");
        List<String> cast = new ArrayList<>();
        List<FilmActor> filmsActors = filmActorRepository.findByFilmId(filmId);
        for (FilmActor f : filmsActors) {
            Actor a = actorRepository.findByActorId(f.getActorId());
            cast.add(a.getFirstName() + " " + a.getLastName());
        }
        return cast;
    }

    @GetMapping(path="/match")
    public @ResponseBody List<Film> getMatchingFilms(@RequestParam String partialTitle) {
        System.out.println("Searching for film by partial title");
        return filmRepository.findByTitleLike("%" + partialTitle + "%");
    }
}
